package src.Details;

import java.util.Random;

import src.Personnage;

public class Taille {
    
    private double tailleElfe(Personnage personnage){
        Random rand = new Random();
        double taille;

        int mult = rand.nextInt()%10;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getGenre()){
            case Homme: taille = 1.65 + (0.025 * (1 + mult)); break;
            case Femme: taille = 1.60 + (0.025 * (1 + mult)); break;
            default: taille = 1.77;
        }

        return taille;
    }

    private double tailleNain(Personnage personnage){
        Random rand = new Random();
        double taille;

        int mult = rand.nextInt()%10;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getGenre()){
            case Homme: taille = 1.30 + (0.025 * (1 + mult)); break;
            case Femme: taille = 1.25 + (0.025 * (1 + mult)); break;
            default: taille = 1.37;
        }

        return taille;
    }

    private double tailleHumain(Personnage personnage){
        Random rand = new Random();
        double taille;

        int mult = rand.nextInt()%10;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getGenre()){
            case Homme: taille = 1.60 + (0.025 * (1 + mult)); break;
            case Femme: taille = 1.52 + (0.025 * (1 + mult)); break;
            default: taille = 1.71;
        }

        return taille;
    }

    private double tailleHalfling(Personnage personnage){
        Random rand = new Random();
        double taille;

        int mult = rand.nextInt()%10;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getGenre()){
            case Homme: taille = 1.00 + (0.025 * (1 + mult)); break;
            case Femme: taille = 0.95 + (0.025 * (1 + mult)); break;
            default: taille = 1.13;
        }

        return taille;
    }

    public double choisisTaille(Personnage personnage){
        double taille;
        switch(personnage.getEspece()){
            case Humain: taille = this.tailleHumain(personnage); break;
            case Halfling: taille = this.tailleHalfling(personnage); break;
            case Elfe: taille = this.tailleElfe(personnage); break;
            case Nain: taille = this.tailleNain(personnage); break;
            default: taille = 1.00; break;
        }

        return taille;
    }
}