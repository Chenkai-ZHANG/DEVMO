package com.example.devmo_android;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final TextView mytextview = (TextView) findViewById(R.id.des_detail2);
        mytextview.setMovementMethod(new ScrollingMovementMethod());
    }
}
