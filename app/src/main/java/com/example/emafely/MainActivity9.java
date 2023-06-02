package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity9 extends AppCompatActivity {

    private LinearLayout resultPage;
    private LinearLayout payFee;
    private LinearLayout assignment;
    private LinearLayout newsAndEvent;
    private LinearLayout announcementPTA;
    private LinearLayout holidays;
    private LinearLayout FAQ;
    private LinearLayout upDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        initView();
        initListener();
    }
    public void initView() {
        resultPage = findViewById(R.id.check_result);
        payFee = findViewById(R.id.pay_fee);
        assignment = findViewById(R.id.assignment);
        newsAndEvent = findViewById(R.id.new_event);
        announcementPTA = findViewById(R.id.announcement1);
        holidays = findViewById(R.id.holiday11);
        FAQ = findViewById(R.id.fag);
        upDate = findViewById(R.id.update222);
    }

    public void initListener() {
        resultPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, ResultPage.class);
                startActivity(intent);
            }
        });
        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,AssignmentPage.class);
                startActivity(intent);
            }
        });
        holidays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,HolidayPage.class);
                startActivity(intent);
            }
        });
        announcementPTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, AnnouncementPTA.class);
                startActivity(intent);
            }
        });

    }
}