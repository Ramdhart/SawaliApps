package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KisActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Kartu Indonesia Sehat");
        setContentView(R.layout.activity_kis);
        listView = (ListView)findViewById(R.id.list_kis);
        adapter = ArrayAdapter.createFromResource(this,R.array.ques_kis,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent myIntent = new Intent(view.getContext(),Kis1.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 1){
                    Intent myIntent = new Intent(view.getContext(),Kis2.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 2){
                    Intent myIntent = new Intent(view.getContext(),Kis3.class);
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
