package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class AssignmentActivity3 extends AppCompatActivity {
    private ImageView backOne;
    private View viewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page3);

        initViews();
        initListeners();
    }
    public void initViews() {
        backOne = findViewById(R.id.back_white);
        viewTwo = findViewById(R.id.view_2_3);
    }
    public void initListeners() {
        backOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity3.this, AssignmentActivity2.class);
                startActivity(intent);
            }
        });
        viewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity3.this, AssignmentActivity4.class);
                startActivity(intent);
            }
        });
    }
}