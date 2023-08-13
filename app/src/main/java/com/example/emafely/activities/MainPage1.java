package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.emafely.R;

public class MainPage1 extends AppCompatActivity {

    private View arrowBack;
    private LinearLayout learnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page1);

        initViews();
        initListeners();

    }
    public void initViews() {
        arrowBack = findViewById(R.id.back_arrow);
        learnAboutUs = findViewById(R.id.layout_learn_about_us);
    }

    public void initListeners() {

        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage1.this, HomePage2.class);
                startActivity(intent);
            }
        });

        learnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage1.this, MainPage2.class);
                startActivity(intent);
            }
        });
    }
}

