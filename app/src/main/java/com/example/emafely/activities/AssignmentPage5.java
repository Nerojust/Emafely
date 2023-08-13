package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.emafely.R;

public class AssignmentPage5 extends AppCompatActivity {

    private ImageView back5;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page5);

        initViews();
        initListeners();
    }
    public void initViews() {
        back5 = findViewById(R.id.back_white5);
        layout = findViewById(R.id.layout1);
    }
    public void initListeners() {
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentPage5.this,AssignmentPage4.class);
                startActivity(intent);
            }
        });
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AssignmentPage5.this,AssignmentPage6.class);
                startActivity(intent);
            }
        });
    }
}