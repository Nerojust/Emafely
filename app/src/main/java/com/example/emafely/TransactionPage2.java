package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TransactionPage2 extends AppCompatActivity {
    private ImageView arrowTrans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_page2);

        initViews();
        initListeners() ;

    }
    public void initViews() {
        arrowTrans2 = findViewById(R.id.arrow15);
    }


    public void initListeners() {
        arrowTrans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionPage2.this,PrenurseryPage.class);
                startActivity(intent);
            }
        });

    }
}