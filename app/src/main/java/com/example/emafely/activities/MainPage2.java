package com.example.emafely.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.emafely.R;
import com.example.emafely.adapters.SliderAdapter;
import com.example.emafely.models.SliderData;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainPage2 extends AppCompatActivity {

    private Button login, enrolNow;

    private LinearLayout myDashboard, myAnnouncement, myRetreat, myAdmission, myContact, mySupport;
    private Button myLogout;
    private LinearLayout layoutStudents1, layoutStudents2, layoutStudents3;
    private NavigationView navView;
    private DrawerLayout myDrawerLayout;
    private Toolbar myToolbar;
    ActionBarDrawerToggle myDrawerToggle;

    SliderView mySlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page2);

        initViews();
        initListeners();

    }

    public void initViews() {
        myDashboard = findViewById(R.id.layout_dashboard);
        myAnnouncement = findViewById(R.id.layout_announcement);
        myRetreat = findViewById(R.id.layout_retreat);
        myAdmission = findViewById(R.id.layout_admission);
        myContact = findViewById(R.id.layout_contact);
        mySupport = findViewById(R.id.layout_support);
        myLogout = findViewById(R.id.btn_log_out);
        layoutStudents1 = findViewById(R.id.layout_students1);
        layoutStudents2 = findViewById(R.id.layout_students2);
        layoutStudents3 = findViewById(R.id.layout_students3);
        login = findViewById(R.id.btn_login);
        enrolNow = findViewById(R.id.btn_enrol_now);
        navView = findViewById(R.id.nav_view_layout);
        myDrawerLayout = findViewById(R.id.drawer_layout);
        myToolbar = findViewById(R.id.toolbar);
        mySlider = findViewById(R.id.slider);

        navView();
        sliderView();
    }

    private void sliderView() {
        ArrayList<SliderData> mySliderData = new ArrayList<>();
        mySliderData.add(new SliderData(R.drawable.student_1));
        mySliderData.add(new SliderData(R.drawable.student_2));
        mySliderData.add(new SliderData(R.drawable.student_3));

        SliderAdapter mySliderAdapter = new SliderAdapter(this, mySliderData);
        mySlider.setSliderAdapter(mySliderAdapter);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        mySlider.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        mySlider.setSliderAdapter(mySliderAdapter);


        // below method is use to set
        // scroll time in seconds.
        mySlider.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        mySlider.setAutoCycle(true);

        // to start autocycle below method is used.
        mySlider.startAutoCycle();


    }


    private void navView() {
        setSupportActionBar(myToolbar);
        myDrawerToggle = new ActionBarDrawerToggle(this, myDrawerLayout, myToolbar, R.string.nav_open, R.string.nav_close);
        myDrawerLayout.addDrawerListener(myDrawerToggle);
        myDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDashboard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainPage2.this, StudentDashboard.class);
                        startActivity(intent);
                    }
                });


            }
        });
    }

    public void initListeners() {

        login();
        enrolNow();
        layoutStudents();

    }

    private void layoutStudents() {

        layoutStudents1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        layoutStudents2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        layoutStudents3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });


    }


    private void enrolNow() {
        enrolNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage2.this, New_user1.class);
                startActivity(intent);
            }
        });
    }

    private void login() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage2.this, ExistingUserActivity.class);
                startActivity(intent);
            }
        });
    }
}