package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.emafely.R;

public class AssignmentActivity1 extends AppCompatActivity {

    private ImageButton rightArrowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page);

        initViews();
        initListeners();

    }
    public void initViews() {
        rightArrowImage = findViewById(R.id.right_button1);

    }

    public void initListeners() {
        rightArrowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity1.this,TimerPage.class);
                startActivity(intent);
            }
        });
    }
}