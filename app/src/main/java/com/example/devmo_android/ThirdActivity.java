package com.example.devmo_android;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView mytextview = (TextView) findViewById(R.id.des_detail1);
        mytextview.setMovementMethod(new ScrollingMovementMethod());

        final ImageView myImage1= (ImageView) findViewById(R.id.map1);
        myImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the string indicating a location. Input is not validated; it is
                // passed to the location handler intact.
                String loc="Les machines de l'île ";

                // Parse the location and create the intent.
                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                // Find an activity to handle the intent, and start that activity.
                if (intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }

            }
        });

        final TextView myText1= (TextView) findViewById(R.id.adress_ile);
        myText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the string indicating a location. Input is not validated; it is
                // passed to the location handler intact.
                String loc="Château des ducs de Bretagne";

                // Parse the location and create the intent.
                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                // Find an activity to handle the intent, and start that activity.
                if (intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }

            }
        });
    }
}
