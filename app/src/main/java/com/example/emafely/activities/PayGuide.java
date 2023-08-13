package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.emafely.R;

public class PayGuide extends AppCompatActivity {

    private LinearLayout layout1;
    private LinearLayout layout2;
    private LinearLayout layout3;
    private LinearLayout layout4;
    private View backImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_guide);

        initViews();
        initListeners();
    }
    public void initViews() {
        layout1 = findViewById(R.id.btn_creche_apply);
        layout2 = findViewById(R.id.btn_pre_nursery_apply);
        layout3 = findViewById(R.id.btn_nursery_apply);
        layout4 = findViewById(R.id.btn_primary_apply);
        backImage = findViewById(R.id.black_back);
    }
    public void initListeners() {
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayGuide.this, CrecheFeeActivity.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PayGuide.this,NurseryPage.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayGuide.this,PrimaryPage.class);
                startActivity(intent);
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayGuide.this, PreNurseryPage.class);
                startActivity(intent);
            }
        });
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayGuide.this, StudentDashboard.class);
                startActivity(intent);
            }
        });
    }
}