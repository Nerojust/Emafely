package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NewUser2 extends AppCompatActivity {

    private ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user2);

        initView();
            initListener();
        }
        public void initView() {


        button = findViewById(R.id.button3);
        }

        public void initListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (NewUser2.this, NewUser3.class);
                startActivity(intent);
            }
        });
    }

}