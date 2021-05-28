package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityAG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ag);

        init();
    }
    private void init() {
        ecouteBtnMorpion();
        ecouteBtnfinish();
        ecouteBtnVersPuissance4();
    }

    private void ecouteBtnMorpion() {
        findViewById(R.id.boutonPuissance4).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityAG.this, SplashActivity2.class);
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

    private void ecouteBtnVersPuissance4() {
        findViewById(R.id.boutonJeuSuivant).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityAG.this, MainActivityAG2.class);
                startActivity(intent);


            }
        });
    }
}