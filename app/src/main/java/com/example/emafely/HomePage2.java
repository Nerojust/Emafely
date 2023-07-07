package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage2 extends AppCompatActivity {
    private View view2Screen;
    private AppCompatButton getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page2);
        initView();
        initListener();
    }
    public void initView(){

        view2Screen = findViewById(R.id.arrow_back);
        getStartedButton = findViewById(R.id.get_started);
    }
    public void initListener(){
        view2Screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage2.this, HomePage1.class);
                startActivity(intent);
            }
        });
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (HomePage2.this, MainPage1.class);
                startActivity(intent);
            }
        });
    }
}