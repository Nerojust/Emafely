package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PayFeePage extends AppCompatActivity {

    private LinearLayout layout1;
    private LinearLayout layout2;
    private LinearLayout layout3;
    private LinearLayout layout4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_fee_page);

        initViews();
        initListeners();
    }
    public void initViews() {
        layout1 = findViewById(R.id.layout_creche);
        layout2 = findViewById(R.id.layout_nursery);
        layout3 = findViewById(R.id.layout_primary);
        layout4 = findViewById(R.id.layout_pre_nursery);
    }
    public void initListeners() {
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayFeePage.this,CrecheFeePage.class);
                startActivity(intent);
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayFeePage.this, PrenurseryPage.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayFeePage.this,NurseryPage.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PayFeePage.this,PrimaryPage.class);
                startActivity(intent);
            }
        });
    }
}