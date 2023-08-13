package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class AssignmentActivity6 extends AppCompatActivity {
    private ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page6);

        initViews();
        initListeners();
    }
    public void initViews() {
        backArrow = findViewById(R.id.back_white6);
    }
    public void initListeners() {
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity6.this, AssignmentActivity5.class);
                startActivity(intent);
            }
        });
    }
}