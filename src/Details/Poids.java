package src.Details;

import java.util.Random;

import src.Personnnage;

public class Poids {

    public int choisisPoids(Personnnage personnage){
        Random rand = new Random();
        int poids;

        int mult = rand.nextInt()%10;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getEspece()){
            case Humain: poids = 47 + (5 * mult); break;
            case Nain: poids = 40 + (4 * mult); break;
            case Elfe: poids = 36 + (4 * mult); break;
            case Halfling: poids = 34 + (3 * mult); break; 
            default: poids = 50;
        }

        return poids;
    }
    
}