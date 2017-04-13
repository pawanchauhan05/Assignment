package com.pawan.assignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.pawan.assignment.R;
import com.pawan.assignment.models.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pawan on 11/4/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    public static final String RUPEE = "₹ ";
    private Context context;
    private List<Data> datas = new ArrayList<>();

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    public RecyclerViewAdapter(Context context, List<Data> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = datas.get(position);
        holder.textViewTitle.setText(data.getTitle());
        holder.textViewDescription.setText(data.getSecondaryTitle());
        holder.textViewPrice.setText(RUPEE + data.getRent());
        holder.textViewSize.setText(data.getCity());
        String textString = getFurnished(data.getFurnishing()) + System.getProperty("line.separator") +getRoomType(data.getType());
        holder.textViewFeature.setText(textString);
        if(holder.textViewTitle.getText().length() > 28) {
            String string = holder.textViewTitle.getText().toString().substring(0, 28);
            holder.textViewTitle.setText(string + "...");
        }

        if(holder.textViewDescription.getText().length() > 58) {
            String string = holder.textViewDescription.getText().toString().substring(0, 58);
            holder.textViewDescription.setText(string + "...");
        }
        holder.textViewPrice.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        holder.textViewSize.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        holder.textViewFeature.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        String url = "http://d3snwcirvb4r88.cloudfront.net/images/";
        try {
            if (data.getPhotos() != null) {
                String imageName = data.getPhotos()[0].getImagesMap().getMedium();
                String imageID = imageName.substring(0, imageName.indexOf("_"));
                String finalImageUrl = url + imageID + "/" + imageName;
                Glide.with(context)
                        .load(finalImageUrl)
                        .into(holder.imageViewItem);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewDescription, textViewPrice, textViewFeature, textViewSize;
        ImageView imageViewItem;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.text_view_title);
            textViewDescription = (TextView) itemView.findViewById(R.id.text_view_description);
            textViewPrice = (TextView) itemView.findViewById(R.id.text_view_price);
            textViewFeature = (TextView) itemView.findViewById(R.id.text_view_feature);
            textViewSize = (TextView) itemView.findViewById(R.id.text_view_size);
            imageViewItem = (ImageView) itemView.findViewById(R.id.image_view_item);
        }
    }

    private String getRoomType(String type) {
        String roomType = "";

        if(type.equals("BHK2")) {
            roomType = "2 Bathrooms";
        } else if(type.equals("BHK3")) {
            roomType = "3 Bathrooms";
        } else if(type.equals("BHK4")) {
            roomType = "4 Bathrooms";
        }
        return roomType;
    }

    private String getFurnished(String furnishing) {
        String furnished = "";
        if(furnishing.equals("SEMI_FURNISHED")) {
            furnished = "Semi Furnished";
        } else if(furnishing.equals("FULLY_FURNISHED")) {
            furnished = "Fully Furnished";
        }
        return furnished;
    }
}
