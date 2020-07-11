package src.Details;

import java.util.Random;

import src.Personnnage;

public class CouleurCheveux {

    private String couleurElfe(){
        Random rand = new Random();
        String[] couleurs = {"Argenté", "Blond", "Châtain", "Brun", "Noir"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }

    private String couleurCheveux(){
        Random rand = new Random();
        String[] couleurs = {"Roux", "Blond", "Châtain", "Brun", "Noir"};
        String couleur;
        int index = rand.nextInt()%couleurs.length;
        if(index < 0) index = -1 * index;
        couleur = couleurs[index];
        return couleur;
    }
    
    public String choisisCouleurCheveux(Personnnage personnage){
        if(personnage.getEspece() == Espece.Elfe) return couleurElfe();
        return couleurCheveux(); 
    }
}