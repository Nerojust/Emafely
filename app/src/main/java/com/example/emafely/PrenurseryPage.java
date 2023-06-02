package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PrenurseryPage extends AppCompatActivity {

    private ImageView arrow;
    private AppCompatButton makePaymentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prenursery_page);

        initViews();
        initListners();
    }
    public void initViews() {
        arrow = findViewById(R.id.arrow_dark_back2);
        makePaymentButton = findViewById(R.id.button11);
    }
    public void initListners() {
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrenurseryPage.this,PayFeePage.class);
                startActivity(intent);
            }
        });
        makePaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PrenurseryPage.this,TransactionPage2.class);
                startActivity(intent);
            }
        });
    }
}