package src.PersonnageFactory;

public class PersonnageFactory {
    public Personnage createPersonnage(PersonnageEspece espece){
        switch(espece){
            case Elfe:
                return new Elfe();
            case Nain:
                return new Nain();
            case Humain:
                return new Humain();
            case Halfling:
                return new Halfling(); 
        }

        return null;
    }
}