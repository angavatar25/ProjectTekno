   package com.example.itsliving;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

   public class MainActivity extends AppCompatActivity {

    public CardView btnHiburan, btnKafe;
    public CardView btnTempatMakan, btnTempatBelanja;
    public CardView btnLaundry, btnFotokopi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnHiburan = (CardView) findViewById(R.id.cardHiburan);
        CardView btnKafe = (CardView) findViewById(R.id.cardKafe);
        CardView btnTempatMakan = (CardView) findViewById(R.id.cardTempatMakan);
        CardView btnTempatBelanja = (CardView) findViewById(R.id.cardTempatBelanja);
        CardView btnLaundry = (CardView) findViewById(R.id.cardLaundry);
        CardView btnFotokopi = (CardView) findViewById(R.id.cardFotokopi);

        //Card View Hiburan
        btnHiburan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Hiburan");
                startActivity(intent);
            }
        });

        //Card View Kafe
        btnKafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Kafe");
                startActivity(intent);
            }
        });

        btnTempatMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Tempat Makan");
                startActivity(intent);
            }
        });

        btnTempatBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Tempat Belanja");
                startActivity(intent);
            }
        });

        btnLaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Laundry");
                startActivity(intent);
            }
        });

        btnFotokopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TempatContainer.class);
                intent.putExtra("title", "Fotokopi");
                startActivity(intent);
            }
        });
    }
}
