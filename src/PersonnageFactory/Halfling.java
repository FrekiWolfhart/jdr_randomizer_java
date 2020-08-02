package src.PersonnageFactory;

public class Halfling extends Personnage{

    public Halfling(){
        super("./data/Halfling.txt", "Halfling");
        super.pick();
        this.raceSpecific();
        super.stats();
    }

    private void raceSpecific(){
        super.age = (20 + (2 * super.random.nextInt(20)));
        if(super.genre == "Masculin") super.taille = (1.00 + (0.025 * super.random.nextInt(10)));
        else super.taille = (0.95 + (0.025 * (super.random.nextInt(10) + 1)));
        super.poids = (30 + (2 * (super.random.nextInt(20) + 1)));
        super.nombreFamille = super.random.nextInt(6) + 1;
    }
    
}