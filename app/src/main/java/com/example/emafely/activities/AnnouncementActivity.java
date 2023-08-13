package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emafely.R;

public class AnnouncementActivity extends AppCompatActivity {
    private AppCompatButton  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.announcement);

        initViews();
        initListeners();
    }
    public void initViews() {

        button = findViewById(R.id.next1);
    }
    public void initListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnnouncementActivity.this, StudentDashboard.class);
                startActivity(intent);
            }
        });

    }
}