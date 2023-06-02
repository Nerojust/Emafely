package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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
                Intent intent = new Intent(TimerPage.this,AssignmentPage2.class);
                startActivity(intent);
            }
        });
    }
}