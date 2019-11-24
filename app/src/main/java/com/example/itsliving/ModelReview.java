package com.example.itsliving;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelReview extends ReviewAdapter {
    private String tvNamaUser;
    private String tvKomentar;

    public ModelReview(ArrayList<ModelReview> arrayList, Context context) {
        super(arrayList, context);
    }

    public void ModelCard() {

    }

    public void ModelCard(String tvNamaUser, String tvKomentar) {
        this.tvNamaUser = tvNamaUser;
        this.tvKomentar = tvKomentar;
    }

    public String getTvNamaUser() {
        return tvNamaUser;
    }

    public void setTvNamaUser(String tvNamaUser) {
        this.tvNamaUser = tvNamaUser;
    }

    public String getTvKomentar() {
        return tvKomentar;
    }

    public void setTvKomentar(String tvKomentar) {
        this.tvKomentar = tvKomentar;
    }
}
