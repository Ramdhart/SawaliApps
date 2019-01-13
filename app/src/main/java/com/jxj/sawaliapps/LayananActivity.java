package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LayananActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Layanan BPJS");
        setContentView(R.layout.activity_layanan);
        listView = (ListView)findViewById(R.id.list_lyn);
        adapter = ArrayAdapter.createFromResource(this,R.array.ques_lyn,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent myIntent = new Intent(view.getContext(),Layanan1.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 1){
                    Intent myIntent = new Intent(view.getContext(),Layanan2.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 2){
                    Intent myIntent = new Intent(view.getContext(),Layanan3.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 3){
                    Intent myIntent = new Intent(view.getContext(),Layanan4.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 4){
                    Intent myIntent = new Intent(view.getContext(),Layanan5.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 5){
                    Intent myIntent = new Intent(view.getContext(),Layanan6.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 6){
                    Intent myIntent = new Intent(view.getContext(),Layanan7.class);
                    startActivityForResult(myIntent,0);
                }

            }
        });
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
}
