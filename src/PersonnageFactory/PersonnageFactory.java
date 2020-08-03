package src.PersonnageFactory;

public class PersonnageFactory {
    public Personnage createPersonnage(PersonnageEspece espece){
        return switch (espece) {
            case Elfe -> new Elfe();
            case Nain -> new Nain();
            case Humain -> new Humain();
            case Halfling -> new Halfling();
        };

    }
}