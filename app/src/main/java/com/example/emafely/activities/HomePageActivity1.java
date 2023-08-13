package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.emafely.R;

public class HomePageActivity1 extends AppCompatActivity {
    private AppCompatButton loGin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page1);

        initView();
        initListener();
    }
    public void initView(){
        //we want to get our find view by id//
        loGin = findViewById(R.id.btn_button);

    }
    public void initListener(){
        //we want to set a listener to the login button//
        loGin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity1.this, HomePageActivity2.class);
                startActivity(intent);
            }
        });
    }
}