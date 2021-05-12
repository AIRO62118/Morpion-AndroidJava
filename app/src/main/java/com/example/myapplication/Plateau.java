package com.example.myapplication;

public class Plateau {

    //Attributs
    private String[] grille;
    
    //Constructeur
    public Plateau() {
        this.grille = new String[9]; }

    //Getter / Setter
    public String[] getGrille() {
        return grille;
    }
    public void setGrille(String[] grille) {
        this.grille = grille;
    }


    //Methodes perso

    public boolean jouer(int index, String symbole) {

        grille[index] = symbole;
        return true;
    }

    public void restart(){
        this.grille = new String[9];
    }
    public boolean testLigne(){

        for (int indexLigne = 0; indexLigne < 3; indexLigne++) {
            if (grille[(indexLigne * 3)] == grille[1 + (indexLigne * 3)] && grille[1 + (indexLigne * 3)] == grille[2 + (indexLigne *3)] && grille[(indexLigne * 3)] != null) return true;
        }
        return false;
    }
    public boolean testColonne(){

        for (int indexColonne = 0; indexColonne < 3; indexColonne++) {
            if (grille[indexColonne] == grille[3 + indexColonne] && grille[3 + indexColonne] == grille[6 + indexColonne] && grille[indexColonne] != null) return true;
        }
        return false;
    }
    public boolean testDiagonale(){

        return grille[4] != null && (grille[0] == grille[4] && grille[4] == grille[8] || grille[2] == grille[4] && grille[4] == grille[6]);
    }
    public boolean testVictoire(){
        return testColonne() || testLigne() || testDiagonale();
    }

































}
