package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MakePayment2 extends AppCompatActivity {
    private View arrowTrans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_payment2);

        initViews();
        initListeners() ;

    }
    public void initViews() {

        arrowTrans2 = findViewById(R.id.arrow14);
    }


    public void initListeners() {
        arrowTrans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakePayment2.this, PreNurseryPage.class);
                startActivity(intent);
            }
        });

    }
}