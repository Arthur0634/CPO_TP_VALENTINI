/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_off_moussally_valentini;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Partie {

    String nom;
    private Joueur joueurAct = new Joueur(nom);
    private Grille Plateau ;//on crée les deux attributs joueur et grille qui vont representer le joueur defini par le nom qu'il a rentré et sa grille de jeu
    
    public Grille getPlateau() 
    {
        return Plateau;
    }
    public void placerCase(int nbcase) {//on place des cases lumineuses aleatoirement sur la grille
        double alea;
        int ligne;
        int colonne;
        Plateau = new Grille(nbcase);
        for (int i = 0; i < nbcase; i++) { //pour placer 5 case allumées en debut de partie
            alea = Math.random() * (nbcase-1);//on genere un double aleatoire entre 0 et 4 qui va designer les 5 lignes de la grille
            ligne = (int) alea;//on prend la parti entiere du double
            alea = Math.random() * (nbcase-1) ;//on genere un double aleatoire entre 0 et 4 qui va designer les 5 colonnes de la grille
            colonne = (int) alea;
            Plateau.change(ligne,colonne);
        }
        
    }


    public void initialiserPartie(int nbcase) {
        Plateau = new Grille(nbcase);
        placerCase(nbcase);
       


    }
}
