package com.pawan.assignment.activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;

import com.pawan.assignment.R;
import com.pawan.assignment.adapter.EndlessRecyclerViewScrollListener;
import com.pawan.assignment.adapter.RecyclerViewAdapter;
import com.pawan.assignment.core.Application;
import com.pawan.assignment.models.Data;
import com.pawan.assignment.models.Response;
import com.pawan.assignment.services.CustomService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private Application application;
    private CustomService customService;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private EndlessRecyclerViewScrollListener scrollListener;
    private List<Data> dataList = new ArrayList<>();
    private boolean filterFlag;
    private String type;
    private String buildingType;
    private String furnished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        application = (Application) getApplication();
        customService = application.retrofit.create(CustomService.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);

        getDataFromServer(1);

        scrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                Log.e(TAG, "onLoadMore: " + page );
                if(filterFlag) {
                    getFilterDataFromServer(0, type, buildingType, furnished);
                } else {
                    getDataFromServer(page);
                }

            }
        };
        recyclerView.addOnScrollListener(scrollListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_name) {
            Log.e(TAG, "onOptionsItemSelected: called" );
            dialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void getDataFromServer(int page) {
        filterFlag = false;
        Map<String, Object> data = new HashMap();
        data.put("lat_lng", "12.9279232,77.6271078");
        data.put("rent", "0,500000");
        data.put("travelTime", String.valueOf(30));
        data.put("pageNo", String.valueOf(page));

        customService
                .getDataServer(data)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Response>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, e.getMessage());
                    }

                    @Override
                    public void onNext(Response response) {
                        dataList.addAll(Arrays.asList(response.getData()));
                        Log.e(TAG, "onNext: " + response.getData().length );
                        if(recyclerViewAdapter != null) {
                            recyclerViewAdapter.setDatas(dataList);
                        } else {
                            recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, Arrays.asList(response.getData()));
                        }
                        recyclerView.setAdapter(recyclerViewAdapter);
                        recyclerViewAdapter.notifyDataSetChanged();
                    }
                });
    }

    private void getFilterDataFromServer(int page, String type, String buildingType, String furnishing) {
        Map<String, Object> data = new HashMap();
        data.put("lat_lng", "12.9279232,77.6271078");
        data.put("rent", "0,500000");
        data.put("travelTime", String.valueOf(30));
        data.put("pageNo", String.valueOf(page));
        data.put("type", type);
        data.put("buildingType", buildingType);
        data.put("furnishing", furnishing);

        customService
                .getFilterDataFromServer(data)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Response>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, e.getMessage());
                    }

                    @Override
                    public void onNext(Response response) {
                        dataList.addAll(Arrays.asList(response.getData()));
                        Log.e(TAG, "onNext: " + response.getData().length );
                        if(recyclerViewAdapter != null) {
                            recyclerViewAdapter.setDatas(dataList);
                        } else {
                            recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, Arrays.asList(response.getData()));
                        }
                        recyclerView.setAdapter(recyclerViewAdapter);
                        recyclerViewAdapter.notifyDataSetChanged();
                    }
                });
    }

    private void filterDialog() {
        final Set<String> setBHK = new HashSet<>();
        final Set<String> setBuildingType = new HashSet<>();
        final Set<String> setFurnishing = new HashSet<>();
        Button button;
        final CheckBox checkBoxBHK2, checkBoxBHK3, checkBoxBHK4, checkBoxAP, checkBoxIH, checkBoxIF, checkBoxFullyFurnished, checkBoxSemiFurnished;
        final Dialog dialog = new Dialog(this);
        //dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.filter_layout);
        checkBoxBHK2 = (CheckBox) dialog.findViewById(R.id.check_box_bhk2);
        checkBoxBHK3 = (CheckBox) dialog.findViewById(R.id.check_box_bhk3);
        checkBoxBHK4 = (CheckBox) dialog.findViewById(R.id.check_box_bhk4);
        checkBoxAP = (CheckBox) dialog.findViewById(R.id.check_box_ap);
        checkBoxIH = (CheckBox) dialog.findViewById(R.id.check_box_ih);
        checkBoxIF = (CheckBox) dialog.findViewById(R.id.check_box_if);
        checkBoxFullyFurnished = (CheckBox) dialog.findViewById(R.id.check_box_fully_furnished);
        checkBoxSemiFurnished = (CheckBox) dialog.findViewById(R.id.check_box_semi_furnished);
        button = (Button) dialog.findViewById(R.id.button_filter);
        checkBoxBHK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK2.isChecked()) {
                    setBHK.add("BHK2");
                } else {
                    setBHK.remove("BHK2");
                }
            }
        });

        checkBoxBHK3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK3.isChecked()) {
                    setBHK.add("BHK3");
                } else {
                    setBHK.remove("BHK3");
                }
            }
        });

        checkBoxBHK4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK4.isChecked()) {
                    setBHK.add("BHK4");
                } else {
                    setBHK.remove("BHK4");
                }
            }
        });

        checkBoxAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxAP.isChecked()) {
                    setBuildingType.add("AP");
                } else {
                    setBuildingType.remove("AP");
                }
            }
        });

        checkBoxIH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxIH.isChecked()) {
                    setBuildingType.add("IH");
                } else {
                    setBuildingType.remove("IH");
                }
            }
        });

        checkBoxIF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxIF.isChecked()) {
                    setBuildingType.add("IF");
                } else {
                    setBuildingType.remove("IF");
                }
            }
        });

        checkBoxFullyFurnished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxFullyFurnished.isChecked()) {
                    setFurnishing.add("FullyFurnished");
                } else {
                    setFurnishing.remove("FullyFurnished");
                }
            }
        });

        checkBoxSemiFurnished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxSemiFurnished.isChecked()) {
                    setFurnishing.add("SemiFurnished");
                } else {
                    setFurnishing.remove("SemiFurnished");
                }
            }
        });
        //dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*List<String> BHKList = new ArrayList<String>(setBHK);
                List<String> buildingTypeList = new ArrayList<String>(setBuildingType);
                List<String> furnishedList = new ArrayList<String>(setFurnishing);
                int BHKListCount = BHKList.size();
                int buildingTypeListCount = BHKList.size();
                int furnishedListCount = BHKList.size();
                for (String s:BHKList) {

                }*/
                filterFlag = true;
                String type = "BHK2/BHK4";
                String buildingType = "AP/IH/IF";
                String furnished = "FULLY_FURNISHED";
                dataList.clear();
                recyclerViewAdapter = null;

                getFilterDataFromServer(0, type, buildingType, furnished);
            }
        });
        dialog.show();


    }

    private void dialog() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        View view = inflater.inflate(R.layout.filter_layout, null);
        builder.setView(view);
        final Set<String> setBHK = new HashSet<>();
        final Set<String> setBuildingType = new HashSet<>();
        final Set<String> setFurnishing = new HashSet<>();
        Button buttonFilter;
        final CheckBox checkBoxBHK2, checkBoxBHK3, checkBoxBHK4, checkBoxAP, checkBoxIH, checkBoxIF, checkBoxFullyFurnished, checkBoxSemiFurnished;
        checkBoxBHK2 = (CheckBox) view.findViewById(R.id.check_box_bhk2);
        checkBoxBHK3 = (CheckBox) view.findViewById(R.id.check_box_bhk3);
        checkBoxBHK4 = (CheckBox) view.findViewById(R.id.check_box_bhk4);
        checkBoxAP = (CheckBox) view.findViewById(R.id.check_box_ap);
        checkBoxIH = (CheckBox) view.findViewById(R.id.check_box_ih);
        checkBoxIF = (CheckBox) view.findViewById(R.id.check_box_if);
        checkBoxFullyFurnished = (CheckBox) view.findViewById(R.id.check_box_fully_furnished);
        checkBoxSemiFurnished = (CheckBox) view.findViewById(R.id.check_box_semi_furnished);
        buttonFilter = (Button) view.findViewById(R.id.button_filter);

        checkBoxBHK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK2.isChecked()) {
                    setBHK.add("BHK2");
                } else {
                    setBHK.remove("BHK2");
                }
            }
        });

        checkBoxBHK3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK3.isChecked()) {
                    setBHK.add("BHK3");
                } else {
                    setBHK.remove("BHK3");
                }
            }
        });

        checkBoxBHK4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxBHK4.isChecked()) {
                    setBHK.add("BHK4");
                } else {
                    setBHK.remove("BHK4");
                }
            }
        });

        checkBoxAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxAP.isChecked()) {
                    setBuildingType.add("AP");
                } else {
                    setBuildingType.remove("AP");
                }
            }
        });

        checkBoxIH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxIH.isChecked()) {
                    setBuildingType.add("IH");
                } else {
                    setBuildingType.remove("IH");
                }
            }
        });

        checkBoxIF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxIF.isChecked()) {
                    setBuildingType.add("IF");
                } else {
                    setBuildingType.remove("IF");
                }
            }
        });

        checkBoxFullyFurnished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxFullyFurnished.isChecked()) {
                    setFurnishing.add("FullyFurnished");
                } else {
                    setFurnishing.remove("FullyFurnished");
                }
            }
        });

        checkBoxSemiFurnished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxSemiFurnished.isChecked()) {
                    setFurnishing.add("SemiFurnished");
                } else {
                    setFurnishing.remove("SemiFurnished");
                }
            }
        });

        buttonFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> BHKList = new ArrayList<String>(setBHK);
                List<String> buildingTypeList = new ArrayList<String>(setBuildingType);
                List<String> furnishedList = new ArrayList<String>(setFurnishing);
                filterFlag = true;
                type = getFormatedString(BHKList);
                buildingType = getFormatedString(buildingTypeList);
                furnished = getFormatedString(furnishedList);
                Log.e(TAG, "onClick: " + type + buildingType + furnished);
                dataList.clear();
                recyclerViewAdapter = null;
                getFilterDataFromServer(0, type, buildingType, furnished);
            }
        });
        builder.create();
        builder.show();

    }

    private String getFormatedString(List<String> list) {
        int count = list.size();
        String formatString = "";
        for(int i = 0; i < list.size(); i++) {
            if(i == (count-1)) {
                formatString = formatString + list.get(i);
            } else {
                formatString = formatString + list.get(i) + "/";
            }
        }
        return formatString;
    }
}
