package com.example.itsliving;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class TempatContainer extends AppCompatActivity {


    ArrayList<ModelCard> itemList;

    public TextView tvTitle;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private CardAdapter cardAdapter;
    public CardView cardView;
    private CardAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_container);


        Intent intent = getIntent();
        String text = intent.getStringExtra("title");
        ActionBar actionBar = getSupportActionBar();


        recyclerView = findViewById(R.id.rvCard);

        itemList = new ArrayList<>();
        generateItemList();

        cardAdapter = new CardAdapter(itemList, getApplicationContext());
        recyclerView.setAdapter(cardAdapter);

        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        cardAdapter.setClickListener(this);

        //SnapHelper snapHelper = new LinearSnapHelper();
        //snapHelper.attachToRecyclerView(recyclerView);

        TextView tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvTitle.setText(text);


        Spinner spName = (Spinner) findViewById(R.id.spinner_dropdown);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets, android.R.layout.simple_spinner_item);

    }

    public void generateItemList()  {
        itemList.add(new ModelCard("Sakinah", "10-22", "081121312", "jl keputih", 4));
        itemList.add(new ModelCard("Sakinah", "10-22", "081121312", "jl keputih", 4));
    }

}
