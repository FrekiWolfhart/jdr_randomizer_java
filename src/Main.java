package src;

import src.PersonnageFactory.Personnage;
import src.PersonnageFactory.PersonnageEspece;
import src.PersonnageFactory.PersonnageFactory;

public class Main{
    public static void main(String[] args) {
        PersonnageFactory factory = new PersonnageFactory();
        //Personnage personnage = factory.createPersonnage(PersonnageEspece.getRandomEspece());
        Personnage personnage = factory.createPersonnage(PersonnageEspece.Humain);
        personnage.print();
    }
}