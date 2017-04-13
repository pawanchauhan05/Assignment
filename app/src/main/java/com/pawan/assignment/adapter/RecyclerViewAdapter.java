package com.pawan.assignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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
        holder.textViewPrice.setText(data.getRent()+"");
        holder.textViewSize.setText(data.getOwnerName());
        holder.textViewFeature.setText(data.getCity());
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
}
