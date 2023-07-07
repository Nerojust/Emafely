package com.example.emafely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfilePage extends AppCompatActivity {

    private ImageView photoImageView;
    private Button btnTakePhoto;

    public static final int RequestPermissionCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        initView();
        initListener();
        EnableRuntimePermission();
    }
    private void initView() {
        btnTakePhoto = findViewById(R.id.btn_take_button);
        photoImageView = findViewById(R.id.IV_image);
    }

    private void initListener() {
        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 7);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode == 7 && resultCode == RESULT_OK) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            photoImageView.setImageBitmap(bitmap);
        }
        if (requestCode == 7 && resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "cancelled oooooo", Toast.LENGTH_SHORT).show();
        }
    }

    public void EnableRuntimePermission() {
        ActivityCompat.requestPermissions(ProfilePage.this, new String[]{
                android.Manifest.permission.CAMERA, android.Manifest.permission.READ_EXTERNAL_STORAGE, android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, RequestPermissionCode);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] result) {
        super.onRequestPermissionsResult(requestCode, permissions, result);
        if (result.length > 0
                && requestCode == RequestPermissionCode
                && result[0] == PackageManager.PERMISSION_GRANTED
                && result[1] == PackageManager.PERMISSION_GRANTED
                && result[2] == PackageManager.PERMISSION_GRANTED) {


            Toast.makeText(ProfilePage.this, "Permission Granted ,Now your application can be access CAMERA.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Permission Canceled,Now your application cannot access CAMERA.", Toast.LENGTH_SHORT).show();

        }

    }

}
