package com.example.itsliving;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelCard extends CardAdapter {
    private String tvNamaToko;
    private String tvJamBuka;
    private String tvNomorTelepon;
    private String tvAlamat;
    private float rbRating;


    public ModelCard(String tvNamaToko, String tvJamBuka, String tvNomorTelepon, String tvAlamat, float rbRating) {
        this.tvNamaToko = tvNamaToko;
        this.tvJamBuka = tvJamBuka;
        this.tvNomorTelepon = tvNomorTelepon;
        this.tvAlamat = tvAlamat;
        this.rbRating = rbRating;
    }

    public ModelCard(){

    }

    public String getTvNamaToko() {
        return tvNamaToko;
    }

    public void setTvNamaToko(String tvNamaToko) {
        this.tvNamaToko = tvNamaToko;
    }

    public String getTvJamBuka() {
        return tvJamBuka;
    }

    public void setTvJamBuka(String tvJamBuka) {
        this.tvJamBuka = tvJamBuka;
    }

    public String getTvNomorTelepon() {
        return tvNomorTelepon;
    }

    public void setTvNomorTelepon(String tvNomorTelepon) {
        this.tvNomorTelepon = tvNomorTelepon;
    }

    public String getTvAlamat() {
        return tvAlamat;
    }

    public void setTvAlamat(String tvAlamat) {
        this.tvAlamat = tvAlamat;
    }

    public float getRbRating() {
        return rbRating;
    }

    public void setRbRating(float rbRating) {
        this.rbRating = rbRating;
    }
}
