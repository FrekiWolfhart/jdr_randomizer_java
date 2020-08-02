package src.PersonnageFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public abstract class Personnage {

    protected Random random;
    protected File fichierSource;
    protected String espece;
    protected String genre;
    protected String name;
    protected int age;
    protected double taille;
    protected int poids;
    protected String couleurCheveux;
    protected String couleurYeux;
    protected String lieuNaissance;
    protected int nombreFamille;
    
    protected final int attack = 1;

    Personnage(String cheminFichier, String espece){
        this.fichierSource = new File(cheminFichier);
        this.espece = espece;
        this.random = new Random();
    }

    private void pickName(Scanner scanner){
        if(this.genre.equals("Masculin")){
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

    private void humanBirthplace(Scanner scanner){
        while(scanner.hasNextLine() && !scanner.nextLine().equals("Lieu de Naissance")){}

        scanner.nextLine();
        String[] provinces = scanner.nextLine().split(",");
        String province = provinces[this.random.nextInt(provinces.length)];

        scanner.nextLine();
        String[] environnements = scanner.nextLine().split(",");
        String environnement = environnements[this.random.nextInt(environnements.length)];

        this.lieuNaissance = province + ", " + environnement;
    }

    private void pickBirthplace(Scanner scanner){
        if(this.espece.equals("Humain")) {
            humanBirthplace(scanner);
            return ;
        }

        while(scanner.hasNextLine() && !scanner.nextLine().equals("Lieu de Naissance")){}

        String[] places = scanner.nextLine().split(",");
        this.lieuNaissance = places[this.random.nextInt(places.length)];

        if(this.lieuNaissance.equals("Humain")){
            try{
                humanBirthplace(new Scanner(new File("./data/Humain.txt")));
            }
            catch(FileNotFoundException e){
                System.out.println("Fichier inexistant.");
                e.printStackTrace();
            }
        }
    }

    private void pickColor(Scanner scanner){
        while(scanner.hasNextLine() && !scanner.nextLine().equals("Couleur")){}

        pickEyeColor(scanner);
        pickHairColor(scanner);
    }

    private void pickEyeColor(Scanner scanner){
        while(scanner.hasNextLine() && !scanner.nextLine().equals("Yeux")){}

        String[] eyes = scanner.nextLine().split(",");
        this.couleurYeux = eyes[this.random.nextInt(eyes.length)];
    }

    private void pickHairColor(Scanner scanner){
        while(scanner.hasNextLine() && !scanner.nextLine().equals("Cheveux")){}

        String[] hair = scanner.nextLine().split(",");
        this.couleurCheveux = hair[this.random.nextInt(hair.length)];
    }

    protected void pick(){
        this.genre = (this.random.nextInt()%2 == 0) ? "Masculin" : "Féminin";
        try{
            Scanner scanner = new Scanner(this.fichierSource);
            this.pickName(scanner);
            this.pickBirthplace(scanner);
            this.pickColor(scanner);
            scanner.close();
        } catch(FileNotFoundException e){
            System.out.println("Fichier inexistant.");
            e.printStackTrace();
        } 
    }

    public void print(){
        System.out.println("DETAILS DU PERSONNAGE");
        System.out.println("Nom:" + this.name);
        System.out.println("Espèce/Genre:" + this.espece + "/" + this.genre);
        System.out.println(this.age + " ans, " + this.poids + " kg, " + this.taille + "m");
        System.out.println("Cheveux " + this.couleurCheveux + ", Yeux " + this.couleurYeux);
        System.out.println("Lieu de naissance: " + this.lieuNaissance);
        System.out.println("A " + this.nombreFamille + " frères et soeurs.");
    }
    
}