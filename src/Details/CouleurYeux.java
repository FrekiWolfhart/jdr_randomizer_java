package src.Details;

import java.util.Random;

import src.Personnnage;

public class CouleurYeux {

    private String couleurHalfling(){
        Random rand = new Random();
        String[] couleurs = {"Bleu", "Marron"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }

    private String couleurNain(){
        Random rand = new Random();
        String[] couleurs = {"Gris", "Bleu", "Cuivre", "Marron", "Mauve"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }

    private String couleurHumain(){
        Random rand = new Random();
        String[] couleurs = {"Gris", "Bleu", "Vert", "Cuivre", "Marron", "Mauve", "Noir"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }

    private String couleurElfe(){
        Random rand = new Random();
        String[] couleurs = {"Gris", "Bleu", "Vert", "Cuivre", "Marron", "Argent", "Mauve", "Noir"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }

    public String choisisCouleurYeux(Personnnage personnage){
        String couleur;

        switch(personnage.getEspece()){
            case Humain: couleur = this.couleurHumain(); break;
            case Halfling: couleur = this.couleurHalfling(); break;
            case Elfe: couleur = this.couleurElfe(); break;
            case Nain: couleur = this.couleurNain(); break;
            default: couleur = "Marron"; break;
        }

        return couleur;
    }
    
}