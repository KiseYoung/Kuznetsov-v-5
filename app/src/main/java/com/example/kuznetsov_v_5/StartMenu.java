package com.example.kuznetsov_v_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmenu);
        Button button1 = findViewById(R.id.btn_nachalo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swither = new Intent(StartMenu.this, JobMenu.class);
                StartMenu.this.startActivity(swither);
            }
        });
    }
}