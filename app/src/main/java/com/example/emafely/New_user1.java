package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class New_user1 extends AppCompatActivity {

    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user1);

        initView();
        initListener();
    }
    public void initView () {
        layout = findViewById(R.id.layout);
    }
    public void initListener() {
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(New_user1.this, NewUser2.class);
                startActivity(intent);
            }
        });
    }
}