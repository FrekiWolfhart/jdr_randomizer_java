package src.PersonnageFactory;

public class Nain extends Personnage{

    public Nain(){
        super("./data/Nain.txt", "Nain");
        super.pick();
        this.raceSpecific();
        super.stats();
    }
    
    private void raceSpecific(){
        super.age = (20 + (5 * super.random.nextInt(20)));
        if(super.genre == "Masculin") super.taille = (1.30 + (0.025 * super.random.nextInt(10)));
        else super.taille = (1.25 + (0.025 * (super.random.nextInt(10) + 1)));
        super.poids = (40 + (2 * (super.random.nextInt(20) + 1)));
        super.nombreFamille = super.random.nextInt(4);
    }
}