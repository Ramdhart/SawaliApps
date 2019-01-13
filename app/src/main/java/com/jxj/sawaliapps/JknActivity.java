package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class JknActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Jaminan Kesehatan Nasional");
        setContentView(R.layout.activity_jkn);
        listView = (ListView)findViewById(R.id.list_jkn);
        adapter = ArrayAdapter.createFromResource(this,R.array.question_jkn,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent myIntent = new Intent(view.getContext(),Jkn1.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 1){
                    Intent myIntent = new Intent(view.getContext(),Jkn2.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 2){
                    Intent myIntent = new Intent(view.getContext(),Jkn3.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 3){
                    Intent myIntent = new Intent(view.getContext(),Jkn4.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 4){
                    Intent myIntent = new Intent(view.getContext(),Jkn5.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 5){
                    Intent myIntent = new Intent(view.getContext(),Jkn6.class);
                    startActivityForResult(myIntent,0);
                }
                if (i == 6){
                    Intent myIntent = new Intent(view.getContext(),Jkn7.class);
                    startActivityForResult(myIntent,0);
                }

            }
        });

//        listView.setOnItemClickListener(this);


    }





//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.list, menu);
//        return true;
//    }




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
