package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.emafely.R;

public class EditPage extends AppCompatActivity {

    private View arrowEdit;
    private TextView accountInformationTextView;
    private TextView languageTextView;
    private TextView notificationTextView;
    private TextView contactTextView;
    private TextView securityTextView;
    private TextView logOutTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);

        initViews();
        initListeners();
    }
    public void initViews() {
        arrowEdit = findViewById(R.id.edit_image);
        accountInformationTextView = findViewById(R.id.information_account);
        languageTextView = findViewById(R.id.tv_language);
        notificationTextView = findViewById(R.id.tv_notification);
        contactTextView = findViewById(R.id.tv_contact);
        securityTextView = findViewById(R.id.tv_security);
        logOutTextView = findViewById(R.id.logout1);
    }
    public void initListeners() {
        arrowEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditPage.this,StudentDashboard.class);
                startActivity(intent);

            }
        });
        accountInformationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditPage.this,ProfilePage.class);
                startActivity(intent);
            }
        });
    }
}