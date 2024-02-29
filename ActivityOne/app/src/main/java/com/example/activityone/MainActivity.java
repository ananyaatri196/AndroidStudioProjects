package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }
}