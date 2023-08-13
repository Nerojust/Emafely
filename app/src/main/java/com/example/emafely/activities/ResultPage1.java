package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class ResultPage1 extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page1);

        initViews();
        initListeners();
    }
    public void initViews() {

        image = findViewById(R.id.sign_image);
    }
    public void initListeners() {
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultPage1.this,ResultPage2.class);
                startActivity(intent);
            }
        });
    }
}