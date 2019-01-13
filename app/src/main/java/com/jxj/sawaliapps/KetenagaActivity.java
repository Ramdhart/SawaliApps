package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KetenagaActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("BPJS Ketenagakerjaan");
        setContentView(R.layout.activity_ketenaga);
        listView = (ListView)findViewById(R.id.list_kete);
        adapter = ArrayAdapter.createFromResource(this,R.array.quis_kete,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent myIntent = new Intent(view.getContext(),Kete1.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 1){
                    Intent myIntent = new Intent(view.getContext(),Kete2.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 2){
                    Intent myIntent = new Intent(view.getContext(),Kete3.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 3){
                    Intent myIntent = new Intent(view.getContext(),Kete4.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 4){
                    Intent myIntent = new Intent(view.getContext(),Kete5.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 5){
                    Intent myIntent = new Intent(view.getContext(),Kete6.class);
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
