package src.PersonnageFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public abstract class Personnage {

    private Random random;
    protected File fichierSource;
    protected String genre;
    protected String name;
    protected int age;
    protected double taille;
    protected int poids;
    protected String couleurCheveux;
    protected String couleurYeux;
    protected int nombreFamille;
    
    protected final int attack = 1;

    Personnage(String cheminFichier){
        this.fichierSource = new File(cheminFichier);
        this.random = new Random();
    }

    private void pickName(Scanner scanner){
        if(this.genre == "Masculin"){
                while(scanner.hasNextLine() && !scanner.hasNext("Masculin")){
                scanner.nextLine();
            }

            if(!scanner.hasNext("Masculin")){
                this.name = "Placeholder";
                return;
            }
        }  
        else{
            while(scanner.hasNextLine() && !scanner.hasNext("Féminin")){
                scanner.nextLine();
            }

            if(!scanner.hasNext("Féminin")){
                this.name = "Placeholder";
                return;
            }
        }

        scanner.nextLine();
        String[] names = scanner.nextLine().split(",");
        this.name = names[this.random.nextInt(names.length)];
    }

    protected void pick(){
        this.genre = (this.random.nextInt()%2 == 0) ? "Masculin" : "Féminin";
        try{
            Scanner scanner = new Scanner(this.fichierSource);
            this.pickName(scanner);
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("Fichier inexistant.");
            e.printStackTrace();
        } 
    }
    
}