package com.geekymusketeers.medify.Firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.geekymusketeers.medify.R;

public class firsrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(firsrActivity.this, DogBite.class);
            startActivity(intent);
        });


        Button button2 = findViewById(R.id.button1);
        button2.setOnClickListener(v1 -> {
            Intent intent1 = new Intent(firsrActivity.this, SnakeBite.class);
            startActivity(intent1);
        });

        Button button3 = findViewById(R.id.button2);
        button3.setOnClickListener(v2 -> {
            Intent intent2 = new Intent(firsrActivity.this, Skinburn.class);
            startActivity(intent2);
        });

        Button button4 = findViewById(R.id.button3);
        button4.setOnClickListener(v3 -> {
            Intent intent3 = new Intent(firsrActivity.this, ViralInfection.class);
            startActivity(intent3);
        });


        Button button5 = findViewById(R.id.button4);
        button5.setOnClickListener(v4 -> {
            Intent intent4 = new Intent(firsrActivity.this, FoodPoisoning1.class);
            startActivity(intent4);
        });

    }
}
