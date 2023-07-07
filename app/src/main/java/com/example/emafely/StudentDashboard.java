package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class StudentDashboard extends AppCompatActivity   {

    private LinearLayout resultPage;
    private LinearLayout payFee;
    private LinearLayout assignment;
    private LinearLayout newsAndEvent;
    private LinearLayout announcementPTA;
    private LinearLayout holidays;
    private LinearLayout FAQ;
    private LinearLayout upDate;
    private ImageView dashboardImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);

        initView();
        initListener();
    }
    public void initView() {


        resultPage = findViewById(R.id.student_result);
        payFee = findViewById(R.id.student_fee);
        assignment = findViewById(R.id.check_assignment);
        newsAndEvent = findViewById(R.id.student_news_event);
        announcementPTA = findViewById(R.id.student_PTA);
        holidays = findViewById(R.id.student_holiday);
        FAQ = findViewById(R.id.student_FAG);
        upDate = findViewById(R.id.student_update);
        dashboardImageView = findViewById(R.id.dashboard_image);
    }

    public void initListener() {
        resultPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this, ResultPage1.class);
                startActivity(intent);
            }
        });
        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this,AssignmentPage.class);
                startActivity(intent);
            }
        });
        holidays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this, Holiday.class);
                startActivity(intent);
            }
        });
        announcementPTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this, Announcement.class);
                startActivity(intent);
            }
        });
        payFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this, PayGuide.class);
                startActivity(intent);
            }
        });
        newsAndEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this,NewsAndEventPage.class);
                startActivity(intent);
            }
        });

        dashboardImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentDashboard.this, EditPage.class);
                startActivity(intent);
            }
        });




    }

}


