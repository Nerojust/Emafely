package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.emafely.R;

public class TimerPage extends AppCompatActivity {

    private ImageButton imageIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_page);

        initViews();
        initListeners();
    }
    public void initViews() {
        imageIB = findViewById(R.id.button);
    }
    public void initListeners() {
        imageIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimerPage.this, AssignmentActivity2.class);
                startActivity(intent);
            }
        });
    }
}