package entity;

import java.util.Scanner;

public class Personne {
    protected String nom, prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //Methode = Module : est une fonction ou procedure
    public  void saisieP()
    {
        Scanner scan = new Scanner((System.in));
        System.out.println("Donner le nom");
        nom = scan.nextLine();
        System.out.println("Donner le prenom");
        prenom = scan.nextLine();

    }
}
