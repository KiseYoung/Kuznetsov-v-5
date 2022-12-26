package com.example.kuznetsov_v_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView img_backset = findViewById(R.id.image_backset);
        img_backset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher2 = new Intent(MainActivity3.this,MainActivity2.class);
                MainActivity3.this.startActivity(switcher2);
            }
        });
    }
}