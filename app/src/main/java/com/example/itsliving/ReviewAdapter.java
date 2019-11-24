package com.example.itsliving;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private ArrayList<ModelReview> arrayList;
    private Context context;

    public ReviewAdapter(ArrayList<ModelReview> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public ReviewAdapter(View view) {
    }

    public void setItemList(ArrayList<ModelReview> arrayList) {
        this.arrayList = arrayList;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_rating_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ViewHolder holder, int position) {
        ModelReview item = arrayList.get(position);
        holder.tvNamaUser.setText(item.getTvNamaUser());
        holder.tvKomentar.setText(item.getTvKomentar());
    }

    @Override
    public int getItemCount() {
        return arrayList != null ? arrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvNamaUser, tvKomentar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaUser = itemView.findViewById(R.id.tvNamaUser);
            tvKomentar = itemView.findViewById(R.id.tvKomentar);
        }
    }
}
