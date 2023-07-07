package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TransactionPage3 extends AppCompatActivity {
    private ImageView arrow13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_page3);

        initViews();
        initListeners();
    }
    public void initViews() {


        arrow13 = findViewById(R.id.arrow15);
    }
    public void initListeners() {
        arrow13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionPage3.this,NurseryPage.class);
                startActivity(intent);
            }
        });
    }
}