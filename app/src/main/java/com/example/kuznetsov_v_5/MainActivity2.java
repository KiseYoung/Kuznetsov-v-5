package com.example.kuznetsov_v_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imgback = findViewById(R.id.image_back);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher1 = new Intent(MainActivity2.this,MainActivity.class);
                MainActivity2.this.startActivity(switcher1);
            }
        });

        ImageView imgsetting = findViewById(R.id.image_setting);
        imgsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swither3 = new Intent(MainActivity2.this,MainActivity3.class);
                MainActivity2.this.startActivity(swither3);
            }
        });

        Button btn_photo = findViewById(R.id.btn_find);
        btn_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sweathers = new Intent(MainActivity2.this,MainActivity4.class);
                MainActivity2.this.startActivity(sweathers);
            }
        });

        ImageView imgnews = findViewById(R.id.image_news);
        imgnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dzen.ru/a/WirGNPAxc9LIaxeR"));
                MainActivity2.this.startActivity(browse);
            }
        });
    }
}