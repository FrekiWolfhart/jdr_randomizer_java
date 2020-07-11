package src.PersonnageFactory;

import java.util.Random;

public enum PersonnageEspece {
    Elfe,
    Nain,
    Humain,
    Halfling;

    public static PersonnageEspece getRandomEspece(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}