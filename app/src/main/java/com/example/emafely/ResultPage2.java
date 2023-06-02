package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultPage2 extends AppCompatActivity {
    private ImageView image111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page2);

        initViews();
        initListener();
    }
    public void initViews() {
        image111 = findViewById(R.id.image_back);
    }
    public void initListener () {
        image111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultPage2.this,PayFeePage.class);
                startActivity(intent);
            }
        });
    }
}