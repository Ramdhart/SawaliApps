package com.jxj.sawaliapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    Button dash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Greetings!");
        setContentView(R.layout.activity_welcome);
        dash = (Button)findViewById(R.id.dash);
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }
    public void pencet (View view){
        Intent tekan = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(tekan);
    }
}
