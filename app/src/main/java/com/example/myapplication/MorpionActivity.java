package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MorpionActivity extends AppCompatActivity {

    //Attributs
    Button boutonRestart;
    ArrayList<Button> casesMorpion;
    Plateau jeu;
    int tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);
        
        init();
        recommencerPartie();
        jeu.testVictoire();

    }


    private void init(){

        boutonRestart = findViewById(R.id.BoutonRestart);
        casesMorpion = new ArrayList<>();
        jeu = new Plateau();
        tour = 0;

        casesMorpion.add((Button) findViewById(R.id.Bouton00));
        casesMorpion.add((Button) findViewById(R.id.Bouton01));
        casesMorpion.add((Button) findViewById(R.id.Bouton02));
        casesMorpion.add((Button) findViewById(R.id.Bouton10));
        casesMorpion.add((Button) findViewById(R.id.Bouton11));
        casesMorpion.add((Button) findViewById(R.id.Bouton12));
        casesMorpion.add((Button) findViewById(R.id.Bouton20));
        casesMorpion.add((Button) findViewById(R.id.Bouton21));
        casesMorpion.add((Button) findViewById(R.id.Bouton22));

        initListeners();
    }

    private void initListeners() {
        for (final Button btn : casesMorpion) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cochercase(btn);
                }
            });
        }
    }

    private void fin() {
        if (jeu.testVictoire()){
            if (tour % 2 == 0){
                Toast.makeText(MorpionActivity.this, "Victoire de X",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MorpionActivity.this, "Victoire de O",Toast.LENGTH_SHORT).show();
            }
            for (Button btnRestant: casesMorpion) {
                btnRestant.setEnabled(false);
            }

        } else if (tour >=8){
            Toast.makeText(MorpionActivity.this, "Egalité",Toast.LENGTH_SHORT).show();
        }
    }
    private void recommencer() {
        jeu.restart();
        for (Button btn:casesMorpion) {
            btn.setEnabled(true);
            btn.setText("");
        }
        tour = 0;
    }

    private void recommencerPartie(){
        boutonRestart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                recommencer();
            }
        });
    }
    private void cochercase(Button btn){

        String symbole;
        int index = Integer.parseInt(btn.getContentDescription().toString());

        if (tour % 2 == 0){
            symbole = "X";
        }  else{
            symbole = "O";
        }

        btn.setText(symbole);
        btn.setEnabled(false);
        jeu.jouer(index,symbole);
        fin();
        tour++;
    }

}



