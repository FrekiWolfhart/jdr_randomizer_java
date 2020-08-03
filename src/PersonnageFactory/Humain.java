package src.PersonnageFactory;

public class Humain extends Personnage{

    public Humain(){
        super("./data/Humain.txt", "Humain");
        super.pick();
        this.raceSpecific();
        super.stats();
    }

    private void raceSpecific(){
        super.age = (16 + super.random.nextInt(20));
        if(super.genre.equals("Masculin")) super.taille = (1.60 + (0.025 * super.random.nextInt(10)));
        else super.taille = (1.52 + (0.025 * (super.random.nextInt(10) + 1)));
        super.poids = (40 + (3 * (super.random.nextInt(20) + 1)));
        super.nombreFamille = super.random.nextInt(6);
    }
}