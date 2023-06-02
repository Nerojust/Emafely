package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PrimaryPage extends AppCompatActivity {
    private ImageView whiteArrow;
    private AppCompatButton button05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_page);


        initViews();
        initListeners();
    }
    public void initViews() {
        whiteArrow = findViewById(R.id.arrow_dark23);
        button05 = findViewById(R.id.button25);
    }
    public void initListeners() {
        whiteArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimaryPage.this,PayFeePage.class);
                startActivity(intent);
            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimaryPage.this,TransactionPage4.class);
                startActivity(intent);
            }
        });
    }
}