package presentation;

import entity.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Etudiant> listeE = new ArrayList<>();
        int N;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Donner le nombre d'etudiant");
            N = scan.nextInt();
        }while (N <= 0);

        System.out.println("Ramplisage de la liste d'etudiants");
        for (int i = 0; i < N; i++)
        {
            System.out.println("Etudiant : " +(i+1));
            Etudiant e = new Etudiant();
            e.saisie();
            // Ajouter un etudiant dans la liste d'etudiant
            listeE.add(e);
        }
        System.out.println("Affichage de liste d'etudiant ");

        for (int i = 0; i < listeE.size(); i++)
        {
            listeE.get(i).affiche();
        }

        /*2e methode
        System.out.println("Affichage de liste d'etudiant ");
        for (Etudiant e : listeE)
        {
            e.affiche();
        }*/
    }
}