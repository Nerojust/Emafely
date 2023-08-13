package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.emafely.R;

public class NewUser3 extends AppCompatActivity {

    private AppCompatButton button5;
    private ImageView arrow16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user3);

        initView();
        initListener();
    }

    public void initView() {

        button5 = findViewById(R.id.button1);
        arrow16 = findViewById(R.id.arrow_seven_back);
    }
    public void initListener() {
       button5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(NewUser3.this, StudentDashboard.class);
               startActivity(intent);
           }
       });
       arrow16.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(NewUser3.this, NewUser2.class);
               startActivity(intent);
           }
       });
    }
}