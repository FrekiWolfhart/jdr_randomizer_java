package src;

import java.util.Random;

import src.Details.*;
import src.Details.Nom.*;

public class Personnage{
    private String nom;
    private Genre genre;
    private Espece espece;
    private int age;
    private double taille;
    private int poids;
    private String couleurCheveux;
    private String couleurYeux;
    private String signeAstral;
    private String lieuDeNaissance;
    private String signeDistinctif;

    public Personnage(){
        Random rand = new Random();
        this.espece = Espece.values()[rand.nextInt(Espece.values().length)];
        this.genre = Genre.values()[rand.nextInt(Genre.values().length)];

        switch(this.espece){
            case Humain: this.nom = new NomHumain().createNom(this); break;
            case Halfling: this.nom = new NomHalfling().createNom(this); break;
            case Elfe: this.nom = new NomElfe().createNom(this); break;
            case Nain: this.nom = new NomNain().createNom(this);
        }

        this.age = new Age().chooseAge(this);
        this.taille = new Taille().choisisTaille(this);
        this.poids = new Poids().choisisPoids(this);
        this.couleurCheveux = new CouleurCheveux().choisisCouleurCheveux(this);
        this.couleurYeux = new CouleurYeux().choisisCouleurYeux(this);
        this.signeAstral = new SigneAstral().choisisSigneAstral();
        this.lieuDeNaissance = new LieuDeNaissance().choisisLieuDeNaissance(this);
        this.signeDistinctif = new SigneDistinctif().choisisSigneDistinctif(rand.nextInt()%4);
    }

    public Genre getGenre(){
        return this.genre;
    }

    public Espece getEspece(){
        return this.espece;
    }

    public void print(){
        System.out.println("DETAILS DU PERSONNAGE");
        System.out.println("Nom:" + this.nom);
        System.out.println("Espèce/Genre:" + this.espece.toString() + "/" + this.genre.toString());
        System.out.println(this.age + " ans, " + this.poids + " kg, " + this.taille + "m");
        System.out.println("Cheveux " + this.couleurCheveux + ", Yeux " + this.couleurYeux);
        System.out.println("Signe Astral: " + this.signeAstral);
        System.out.println("Lieu de naissance: " + this.lieuDeNaissance);
        System.out.println("Signes distinctifs: " + this.signeDistinctif);
    }
}