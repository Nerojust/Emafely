package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class PreNurseryPage extends AppCompatActivity {

    private ImageView arrow;
    private AppCompatButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_nursery_page);

        initViews();
        initListeners();
    }
    public void initViews() {
        arrow = findViewById(R.id.IV_back_arrow);
        loginButton = findViewById(R.id.sign_in);
    }
    public void initListeners() {
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreNurseryPage.this, StudentDashboard.class);
                startActivity(intent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PreNurseryPage.this, MakePayment2.class);
                startActivity(intent);
            }
        });
    }
}