package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityAG2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ag2);

        init();
    }
    private void init() {
        ecouteBtnPuissance4();
        ecouteBtnfinish();
        ecouteBtnVersMorpion();
    }

    private void ecouteBtnPuissance4() {
        findViewById(R.id.boutonPuissance4).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityAG2.this, SplashActivity3.class);
                startActivity(intent);

            }
        });
    }
    private void ecouteBtnfinish() {
        findViewById(R.id.boutonQuitter).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

    private void ecouteBtnVersMorpion() {
        findViewById(R.id.boutonJeuPrecedent).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityAG2.this, MainActivityAG.class);
                startActivity(intent);

            }
        });
    }
}