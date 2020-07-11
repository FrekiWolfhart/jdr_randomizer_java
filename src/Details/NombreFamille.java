package src.Details;

import java.util.Random;

import src.Personnnage;

public class NombreFamille {
    
    private int nombreFamille(int modulo){
        int index = new Random().nextInt()%modulo;
        if(index < 0) return -1 * index;
        return index;
    }

    public int choisisNombreFamille(Personnnage personnage){
        switch(personnage.getEspece()){
            case Elfe: return nombreFamille(4);
            case Nain: return nombreFamille(4);
            case Humain: return nombreFamille(6);
            case Halfling: return 1 + nombreFamille(6);
            default: return 0;
        }
    }
}