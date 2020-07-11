package src.Details;

import java.util.Random;

import src.Personnnage;

public class Age {

    public int chooseAge(Personnnage personnage){
        int age;
        Random rand = new Random();

        int mult = rand.nextInt()%20;
        if(mult < 0)  mult = -1 * mult;

        switch(personnage.getEspece()){
            case Humain: age = 16 + (mult); break;
            case Elfe: age = 30 + (5 * mult); break;
            case Nain: age = 20 + (5 * mult); break;
            case Halfling: age = 20 + (2 * mult); break;
            default: age = 30; break;
        }

        return age;
    }
    
}