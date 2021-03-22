package com.example.devmo_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
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
        final ImageView myimageview = (ImageView) findViewById(R.id.imageplace1);
        myimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        final TextView mytextview2 = (TextView) findViewById(R.id.adress1);
        mytextview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        final TextView mytextview3 = (TextView) findViewById(R.id.description1);
        mytextview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        final TextView mytextview4= (TextView) findViewById(R.id.name2);
        mytextview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });

        final ImageView myimageview1 = (ImageView) findViewById(R.id.imageplace2);
        myimageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });
        final TextView mytextview5 = (TextView) findViewById(R.id.adress2);
        mytextview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });
        final TextView mytextview6 = (TextView) findViewById(R.id.description2);
        mytextview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });

    }
}

