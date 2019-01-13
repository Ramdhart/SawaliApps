package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout jelan, ksi, jkn, ask, kete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Dashboard!");
        setContentView(R.layout.activity_main);
        jelan = (RelativeLayout)findViewById(R.id.jenislayanan);
        ksi = (RelativeLayout)findViewById(R.id.kis);
        jkn = (RelativeLayout)findViewById(R.id.jkn);
        ask = (RelativeLayout)findViewById(R.id.AskMe);
        kete = (RelativeLayout)findViewById(R.id.ketenagakerjaan);
//        jelan.setOnClickListener(this);
//        ksi.setOnClickListener(this);
//        jkn.setOnClickListener(this);
//        ask.setOnClickListener(this);
//        kete.setOnClickListener(this);
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    public void onClick1 (View view) {
        Intent layanan = new Intent(MainActivity.this, LayananActivity.class);
        startActivity(layanan);
    }
     public void onClick2 (View view) {
         Intent kis = new Intent(MainActivity.this, KisActivity.class);
         startActivity(kis);

     }

     public void onClick3 (View view) {
         Intent jkn = new Intent(MainActivity.this, JknActivity.class);
         startActivity(jkn);
     }

     public void onClick4(View view){
                Intent kete = new Intent(MainActivity.this, KetenagaActivity.class);
                startActivity(kete);

        }
     public void onClick5(View view){
        Intent cet = new Intent (MainActivity.this, Login.class);
        startActivity(cet);
     }

     public void onClick6(View view){
        finish();
     }
    }



