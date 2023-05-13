package com.example.activitytest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Button takePhoto = (Button) findViewById(R.id.take_photo);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button chooseFromAlbum = (Button) findViewById(R.id.choose_from_album);
        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TakePhotoActivity.class);
                startActivity(intent);
            }
        });
        chooseFromAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChooseFromAlbumActivity.class);
                startActivity(intent);
            }
        });
    }
}