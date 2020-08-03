package src.CaracteristiquesFactory;

import src.PersonnageFactory.Personnage;

public class CaracteristiquesFactory {
    public Caracteristiques createCaracteristiques(Personnage personnage){
        return switch (personnage.getEspece()) {
            case "Elfe" -> new Elfe(personnage.getRandom());
            case "Nain" -> new Nain(personnage.getRandom());
            case "Humain" -> new Humain(personnage.getRandom());
            case "Halfling" -> new Halfling(personnage.getRandom());
            default -> null;
        };

    }
}
