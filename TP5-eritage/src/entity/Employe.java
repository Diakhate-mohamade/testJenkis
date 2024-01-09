package entity;

import DAO.IPersonne;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    private String fonction;
    private  int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        saisieP();
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner la fonction");
        fonction = scan.nextLine();
        do
        {
            System.out.println("Donner le salaire");
            salaire = scan.nextInt();
        }while (salaire <= 0);


    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + nom.toLowerCase());
        System.out.println("Prenom : " + prenom.toLowerCase());
        System.out.println("Fonction : " + fonction.toLowerCase());
        System.out.println("Salaire : " + salaire);
    }
}
