package src.Details;

import java.util.Random;

import src.Personnnage;

public class LieuDeNaissance {

    private String lieuDeNaissanceElfe(){
        Random rand = new Random();
        String[] lieux = new String[]{"Cité d'Altdorf", "Cité de Marienburg", "Forêt de Laurelorn",
                                      "Grande forêt", "Forêt de Reikwald"};
        String lieu;
        int index = rand.nextInt()%lieux.length;
        if(index < 0) index = -1 * index;
        lieu = lieux[index];
        return lieu;
    }

    private String lieuDeNaissanceNain(){
        Random rand = new Random();
        String[] lieux = new String[]{lieuDeNaissanceHumain(), "Karak Norn", "Karak Izor",
                                      "Karak Hirn", "Karak Kadrin", "Karaz-a-Karak",
                                      "Zhufbar", "Barak Varr"};
        String lieu;
        int index = rand.nextInt()%lieux.length;
        if(index < 0) index = -1 * index;
        lieu = lieux[index];
        return lieu;
    }

    private String lieuDeNaissanceHumain(){
        Random rand = new Random();
        String[] lieux = new String[]{"Averland", "Hochland", "Middenland", "Nordland",
                                      "Ostermark", "Ostland", "Reikland", "Stirland",
                                      "Talabecland", "Wissenland"};
        String[] typeVille = new String[]{"Cité", "Ville prospère", "Bourg", "Ville fortifiée",
                                          "Village agricole", "Village pauvre", "Petite communauté",
                                          "Ferme (élevage)", "Ferme (culture)", "Taudis"};
        String lieu;
        int index = rand.nextInt()%lieux.length;
        if(index < 0) index = -1 * index;
        int position = rand.nextInt()%typeVille.length;
        if(position < 0) position = -1 * position;
        lieu = lieux[index].concat(" ").concat(typeVille[position]);
        return lieu;
    }

    private String lieuDeNaissanceHalfling(){
        Random rand = new Random();
        String[] lieux = new String[]{"Le Moot", lieuDeNaissanceHumain()};
        String lieu;
        int index = rand.nextInt()%lieux.length;
        if(index < 0) index = -1 * index;
        lieu = lieux[index];
        return lieu;
    }
    
    public String choisisLieuDeNaissance(Personnnage personnage){
        switch(personnage.getEspece()){
            case Humain: return this.lieuDeNaissanceHumain();
            case Halfling: return this.lieuDeNaissanceHalfling();
            case Elfe: return this.lieuDeNaissanceElfe();
            case Nain: return this.lieuDeNaissanceNain();
            default: return "Vieux Monde";
        }
    }
}