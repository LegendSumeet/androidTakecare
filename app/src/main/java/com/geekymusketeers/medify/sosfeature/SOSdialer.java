package com.geekymusketeers.medify.sosfeature;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.geekymusketeers.medify.R;


public class SOSdialer extends AppCompatActivity {
    ImageButton btn, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        btn = (ImageButton) findViewById(R.id.imagebtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel: 102");
                Intent intent2 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent2);
            }
        });

        btn2 = (ImageButton) findViewById(R.id.imagebtn1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Uri uri = Uri.parse("tel: 100");
                Intent intent3 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent3);
            }
        });

        btn3 = (ImageButton) findViewById(R.id.imagebtn2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Uri uri = Uri.parse("tel: 112");
                Intent intent4 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent4);
            }
        });

        btn4 = (ImageButton) findViewById(R.id.imagebtn3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Uri uri = Uri.parse("tel: 101");
                Intent intent5 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent5);
            }
        });

        btn5 = (ImageButton) findViewById(R.id.imagebtn4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                Uri uri = Uri.parse("tel: 1091");
                Intent intent6 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent6);
            }
        });


//Add
    }
}