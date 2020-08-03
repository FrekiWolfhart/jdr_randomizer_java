package src.CaracteristiquesFactory;

import java.util.Random;

public class Humain extends Caracteristiques{

    public Humain(Random random){
        super(random);
        super.setCapaciteCombat(20);
        super.setCapaciteTir(20);
        super.setForce(20);
        super.setEndurance(20);
        super.setAgilite(20);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilite(20);
        super.setBlessures(10);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 4;
        super.setPointDestin(2, 2);
    }
}
