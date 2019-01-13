package com.jxj.sawaliapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Jkn6 extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Jaminan Kesehatan Nasional");
        setContentView(R.layout.activity_jkn6);
        listView = (ListView)findViewById(R.id.jknl6);
        adapter = ArrayAdapter.createFromResource(this,R.array.jjkn6,android.R.layout.simple_list_item_1);
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
