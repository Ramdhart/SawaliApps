package com.jxj.sawaliapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Layanan2 extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Layanan BPJS");
        setContentView(R.layout.activity_layanan2);
        listView = (ListView)findViewById(R.id.jlyn2);
        adapter = ArrayAdapter.createFromResource(this,R.array.jlyn2,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
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
