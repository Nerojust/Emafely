package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NurseryPage extends AppCompatActivity {

    private ImageButton imageArrowButton;
    private AppCompatButton login4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery_page);

        initViews();
        initListeners();
    }
    public void initViews () {
        imageArrowButton = findViewById(R.id.arrow_dark_back20);
        login4 = findViewById(R.id.button11);
    }
    public void initListeners() {
        imageArrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NurseryPage.this,PayFeePage.class);
                startActivity(intent);
            }
        });
        login4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NurseryPage.this,TransactionPage3.class);
                startActivity(intent);
            }
        });
    }
}