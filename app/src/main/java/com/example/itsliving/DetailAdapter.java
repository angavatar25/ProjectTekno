package com.example.itsliving;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailAdapter extends DetailActivity {

    private ArrayList<ModelCard> itemList;
    private Context context;
    public CardView cardView;

    public DetailAdapter(ArrayList<ModelCard> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    public DetailAdapter() {
    }

    public void setItemList(ArrayList<ModelCard> itemList) {
        this.itemList = itemList;
    }
//
//    @NonNull
//    @Override
//    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_tempat_card, viewGroup, false);
//        return new CardAdapter.ViewHolder(view);
//    }

//    @Override
    public void onBindViewHolder(@NonNull final CardAdapter.ViewHolder viewHolder, int i) {
        ModelCard item = itemList.get(i);
        viewHolder.tvNamaToko.setText(item.getTvNamaToko());
        viewHolder.tvJamBuka.setText(item.getTvJamBuka());
        viewHolder.tvNomorTelepon.setText(item.getTvNomorTelepon());
        viewHolder.rbRating.setRating(item.getRbRating());
        viewHolder.tvAlamat.setText(item.getTvAlamat());
    }


    public interface ClickListener {
        public void itemClicked(View view, int position);
    }

    public int getItemCount() {
        return itemList != null ? itemList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvNamaToko, tvJamBuka, tvNomorTelepon, tvAlamat;
        public RatingBar rbRating;
        Button btnLebihLanjut;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaToko = itemView.findViewById(R.id.tvNamaToko);
            tvJamBuka = itemView.findViewById(R.id.tvJamBuka);
            tvNomorTelepon = itemView.findViewById(R.id.tvNomorTelepon);
            rbRating = itemView.findViewById(R.id.rbRatingBar);
            tvAlamat = itemView.findViewById(R.id.tvAlamatToko);
        }
    }
}
