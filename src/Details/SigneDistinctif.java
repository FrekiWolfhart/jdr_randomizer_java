package src.Details;

import java.util.Random;

public class SigneDistinctif {
    
    public String choisisSigneDistinctif(int nbSignes){
        Random rand = new Random();

        String[] listeSignes = new String[]{"Marque de vérole", "Rougeaud", "Balafre",
                                            "Tatouage", "Boucle d'oreille", "Oreille abimée",
                                            "Anneau nasal", "Verrue", "Nez cassé",
                                            "Dent en moins", "Dentition crasseuse", "Strabisme",
                                            "Sourcil manquant", "Doigt en moins", "Ongle en moins",
                                            "Démarche atypique", "Odeur bizarre", "Gros nez",
                                            "Grain de beauté", "Calvitie très localisée", "Couler d'oeil étrange"};
        
        String signes = "Aucun";
        int index;
        for(int position = 0; position < nbSignes; position ++){
            index = rand.nextInt()%listeSignes.length;
            if(index < 0) index = -1 * index;

            if(position == 0){
                signes = listeSignes[index];
                continue;
            }
            
            signes = signes + ", " + listeSignes[index];
        }

        return signes;
    }
}