package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class AssignmentActivity4 extends AppCompatActivity {
    private ImageView arrowBack;
    private View viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page4);

        initViews();
        initListeners();
    }
    public void initViews() {
        arrowBack = findViewById(R.id.back_z);
        viewButton= findViewById(R.id.view_10_3);

    }
    public void initListeners() {
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity4.this, AssignmentActivity3.class);
                        startActivity(intent);
            }
        });
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity4.this, AssignmentActivity5.class);
                startActivity(intent);
            }
        });
    }
}