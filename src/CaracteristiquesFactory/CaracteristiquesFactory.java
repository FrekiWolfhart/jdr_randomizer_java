package src.CaracteristiquesFactory;

import src.PersonnageFactory.Personnage;

public class CaracteristiquesFactory {
    public Caracteristiques createCaracteristiques(Personnage personnage){
        switch(personnage.getEspece()){
            case "Elfe":
                return new Elfe(personnage.getRandom());
            case "Nain":
                return new Nain(personnage.getRandom());
            case "Humain":
                return new Humain(personnage.getRandom());
            case "Halfling":
                return new Halfling(personnage.getRandom());
        }

        return null;
    }
}
