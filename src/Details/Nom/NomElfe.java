package src.Details.Nom;

import src.Personnage;
import src.Details.Genre;

import java.util.Random;

public class NomElfe{

    private String femaleName(){
        Random rand = new Random();
        String[] names = new String[]{"Alane", "Fanriel", "Ionor", "Siluvaine", "Yuviel"};
        String name;
        int index = rand.nextInt()%names.length;
        if(index < 0) index = -1 * index;
        name = names[index];
        return name;
    }

    private String maleName(){
        Random rand = new Random();
        String[] names = new String[]{"Aluthol", "Eldillor", "Imhol", "Ravandil", "Yavandir"};
        String name;
        int index = rand.nextInt()%names.length;
        if(index < 0) index = -1 * index;
        name = names[index];
        return name;
    }

    public String createNom(Personnage personnage){
        if(personnage.getGenre() == Genre.Femme){
            return this.femaleName();
        }

        return this.maleName();
    }
}