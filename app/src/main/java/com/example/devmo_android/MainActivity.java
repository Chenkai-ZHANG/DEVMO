package com.example.devmo_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mytextview = (TextView) findViewById(R.id.name1);
        mytextview.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               MainActivity.this.startActivity(new Intent(MainActivity.this, SecondActivity.class));
           }
        });
        final TextView mytextview1 = (TextView) findViewById(R.id.name2);
        mytextview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });
    }
}

