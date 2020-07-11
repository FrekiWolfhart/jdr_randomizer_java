package src.Details.Nom;

import src.Personnnage;
import src.Details.*;

import java.util.Random;

public class NomHumain{
    
    private String femaleName(){
        Random rand = new Random();
        String[] names = new String[]{"Alexa", "Elfrida", "Ilsa", "Régina", "Wertha"};
        String name;
        int index = rand.nextInt()%names.length;
        if(index < 0) index = -1 * index;
        name = names[index];
        return name;
    }

    private String maleName(){
        Random rand = new Random();
        String[] names = new String[]{"Adelbert", "Félix", "Konrad", "Rudiger", "Wolfgang"};
        String name;
        int index = rand.nextInt()%names.length;
        if(index < 0) index = -1 * index;
        name = names[index];
        return name;
    }

    public String createNom(Personnnage personnage){
        if(personnage.getGenre() == Genre.Femme){
            return this.femaleName();
        }

        return this.maleName();
    }

}