package com.example.itsliving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ArrayList<ModelCard> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        itemList = new ArrayList<>();
        generateItemList();

    }
    public void generateItemList() {
        itemList.add(new ModelCard("Sakinah", "10-22", "081121312", "jl keputih", 5));
        itemList.add(new ModelCard("Sakinah", "10-22", "081121312", "jl keputih", 5));
    }
}
