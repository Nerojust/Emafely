package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class AssignmentActivity2 extends AppCompatActivity {
    private ImageView backImage;
    private View  view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page2);

        initViews();
        initListeners();
    }
    public void initViews() {
        backImage = findViewById(R.id.back_timer);
        view1 = findViewById(R.id.view_1_3);
    }
    public void initListeners() {
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentActivity2.this,TimerPage.class);
                startActivity(intent);
            }
        });
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AssignmentActivity2.this, AssignmentActivity3.class);
                startActivity(intent);
            }
        });
    }
}