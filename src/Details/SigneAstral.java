package src.Details;

import java.util.Random;

public class SigneAstral {
    
    public String choisisSigneAstral(){
        Random rand = new Random();
        String[] signes = {"Wymund l'Anachorète", "La Grande Croix", "Le Trait du Peintre",
                           "Gnuthus le Buffle", "Dragomas le Dragon", "Le Crépuscule",
                           "Le Fourreau de Grungni", "Mammit le Sage", "Mummit le Fou",
                           "Les Deux Boeufs", "Le Danseur", "Le Tambour", "Le Flûtiste",
                           "Vobist le Pâle", "La Charrette Brisée", "La Chêvre Sauvage",
                           "Le Chaudron de Rhya", "Cackelfax le Coq", "Le Grimmoire",
                           "L'Étoile du Sorcier"};
        String signe;
        int index = rand.nextInt()%signes.length;
        if(index < 0) index = -1 * index;
        signe = signes[index];
        return signe;
    }

}