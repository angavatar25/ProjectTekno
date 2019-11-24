package com.example.itsliving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempatCardActivity extends AppCompatActivity {

    public Button btLihatLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_card);

        Button btLihatLanjut = (Button) findViewById(R.id.btnLihatLanjut);

        btLihatLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempatCardActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
