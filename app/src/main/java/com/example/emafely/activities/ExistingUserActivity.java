package com.example.emafely.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emafely.R;
import com.example.emafely.constants.ConstantTreasure;

import java.util.Timer;
import java.util.TimerTask;

public class ExistingUserActivity extends AppCompatActivity {

    private AppCompatButton button;
    private EditText userNameEditText;
    private EditText passWordEditText;
    private TextView TextView;


    public String userName;


    public int currentimageindex = 0;
    Timer timer;
    TimerTask task;
    ImageView image1;

    int[] IMAGE_IDS = {R.drawable.twowii, R.drawable.roundm, R.drawable.capsmiii, R.drawable.cebmii,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.existing_user);

        // casting of textview
        TextView textView = findViewById(R.id.text_view);

        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);

        final Handler mHandler = new Handler();

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {

                AnimateandSlideShow();

            }
        };

        int delay = 1000; // delay for 1 sec.

        int period = 8000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                mHandler.post(mUpdateResults);

            }

        }, delay, period);

    }

    public void onClick(View v) {

        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
    private void AnimateandSlideShow() {

        image1 = (ImageView)findViewById(R.id.image_1);
        image1.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);

        currentimageindex++;

        initViews();
        initListeners();

    }
    public void initViews() {
        button = findViewById(R.id.button1);
        userNameEditText = findViewById(R.id.et_user_name);
        passWordEditText = findViewById(R.id.et_password);

    }
    public void initListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ValidateuserName()) {
                    Toast.makeText(ExistingUserActivity.this, "Provide correct username", Toast.LENGTH_SHORT).show();
                    saveData();
                    Intent intent = new Intent(ExistingUserActivity.this, New_user1.class);
                    startActivity(intent);
                }
            }
        });
        loadData();
        updateData();
    }
    public void saveData() {
        SharedPreferences peterSharedPreference = getSharedPreferences(getString(R.string.my_preferences), Context.MODE_PRIVATE);
        SharedPreferences.Editor myEditor = peterSharedPreference.edit();
        myEditor.putString(ConstantTreasure.userName, userNameEditText.getText().toString());

        myEditor.apply();
    }
    public void loadData() {
        SharedPreferences peterSharedPreference = getSharedPreferences(getString(R.string.my_preferences), Context.MODE_PRIVATE);
        userName = peterSharedPreference.getString(ConstantTreasure.userName, " ");


    }
    public void updateData() {
        userNameEditText.setText(userName);


    }
    private boolean ValidateuserName() {
        String passwordInput = userNameEditText.getText().toString().trim();
        String acceptablePassword = "^([a-zA-Z&$+._\\d]*)$";
        if (passwordInput.isEmpty()) {
            userNameEditText.setError("field cant be empty");
            return false;
        }

        if (passwordInput.length() < 6) {
            userNameEditText.setError("invalid password");
            return false;
        }
        if (!passwordInput.matches(acceptablePassword)) {
            userNameEditText.setError("incorrect input typed");
            return false;
        }
        return true;

    }
}








