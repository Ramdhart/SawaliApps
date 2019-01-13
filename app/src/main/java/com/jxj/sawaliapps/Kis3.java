package com.jxj.sawaliapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kis3 extends AppCompatActivity {
    ListView listView1, listView2;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kis3);
        this.setTitle("Kartu Indonesia Sehat");
        listView1 = (ListView)findViewById(R.id.jkis3l1);
        listView2 = (ListView)findViewById(R.id.jkis322);
        adapter = ArrayAdapter.createFromResource(this,R.array.jkis311,android.R.layout.simple_list_item_1);
        listView1.setAdapter(adapter);
        adapter = ArrayAdapter.createFromResource(this,R.array.jkis322,android.R.layout.simple_list_item_1);
        listView2.setAdapter(adapter);
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

