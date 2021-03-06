package src.PersonnageFactory;

public class Elfe extends Personnage{

    public Elfe(){
        super("./data/Elfe.txt", "Elfe");
        super.pick();
        this.raceSpecific();
        super.stats();
    }
    
    private void raceSpecific(){
        super.age = (30 + (5 * super.random.nextInt(20)));
        if(super.genre.equals("Masculin")) super.taille = (1.65 + (0.025 * super.random.nextInt(10)));
        else super.taille = (1.60 + (0.025 * (super.random.nextInt(10) + 1)));
        super.poids = (36 + (2 * (super.random.nextInt(20) + 1)));
        super.nombreFamille = super.random.nextInt(4);
    }
}