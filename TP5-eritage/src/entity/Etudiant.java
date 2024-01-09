package entity;

import DAO.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    private String generateMatricule()
    {
        String mat = prenom.charAt(0)+nom + "@groupeisi.com";
        return mat.toLowerCase();
    }

    @Override
    public void saisie() {
        saisieP();
        matricule = generateMatricule();
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Donner la moyenne");
            moyenne = scan.nextDouble();
        }while (moyenne <= 0 || moyenne >= 20);
    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + nom.toLowerCase());
        System.out.println("Prenom : " + prenom.toLowerCase());
        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + moyenne);

    }
}
