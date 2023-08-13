package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.emafely.R;

public class CrecheFeeActivity extends AppCompatActivity {
     private TextView totalTextView;
     private LinearLayout layout;
     private AppCompatButton logIn;
     private ImageButton imageArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creche_fee_page);

        initViews();
        initListeners();
    }
    public void initViews() {
        totalTextView = findViewById(R.id.btn_total);
        layout = findViewById(R.id.layout_box);
        logIn = findViewById(R.id.button10);
        imageArrow = findViewById(R.id.arrow_dark_back);
    }
    public void initListeners() {
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrecheFeeActivity.this, MakePayment1.class);
                startActivity(intent);
            }
        });
        imageArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrecheFeeActivity.this, PayGuide.class);
                startActivity(intent);

            }
        });
    }
}