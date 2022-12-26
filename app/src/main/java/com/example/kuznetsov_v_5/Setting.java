package com.example.kuznetsov_v_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingmenu);
        ImageView img_backset = findViewById(R.id.image_backset);
        img_backset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher2 = new Intent(Setting.this, JobMenu.class);
                Setting.this.startActivity(switcher2);
            }
        });
    }
}