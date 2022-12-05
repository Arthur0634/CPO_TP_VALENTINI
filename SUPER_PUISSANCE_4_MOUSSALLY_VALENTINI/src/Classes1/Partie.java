package Classes1;

import java.util.Random; //on importe le module Random
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author arthu
 */
public class Partie {

    private Joueur[] listeJoueurs = new Joueur[2]; //on cree un tableau de joueurs
    private Joueur joueurCourant;
    private PlateauDeJeu plateau = new PlateauDeJeu();

    public Partie(Joueur joueur1, Joueur joueur2) {
        listeJoueurs[0] = joueur1;//on place les deux joueur dans le tableau de joueur
        listeJoueurs[1] = joueur2;
    }

    public void attribuerCouleurAuxJoueurs() {//on attribue une couleur aux joueurs
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(1);
        int temp;

        if (n == 1) {
            listeJoueurs[0].affecterCouleur("rouge");
            temp = 0;
        } else {
            listeJoueurs[0].affecterCouleur("jaune");
            temp = 1;
        }

        if (temp == 0) {
            listeJoueurs[1].affecterCouleur("jaune");
        } else {
            listeJoueurs[1].affecterCouleur("rouge");
        }

    }

    public void creerEtAffecterJeton(Joueur j_jeton) {//on crée des jetons et on les affecte (commentaire tres utile)
        String clr_j = j_jeton.donnerCouleur();

        for (int i = 0; i <= 30; i++) { //on creer 30 jetons en previsions de si on ajoute les fonction trou noir et desintegrateur

            j_jeton.ajouterJeton(new Jeton(clr_j));

        }
    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
    }

    public void lancerPartie() {

        joueurCourant = listeJoueurs[0];//le joueur classé en premier comence
        boolean fini = true;
        int test = 0;
                
        while (fini) { //tant que la partie n'est pas finie
            
            if(test == 1){
                System.out.println(joueurCourant.ObtenirNom() + " a gagne");
                plateau.afficherGrilleSurConsole();
                break;
            }
            Scanner sc;
            int colonneJouee;
            
            sc = new Scanner(System.in);
            for (int p = 0; p < 2; p++) {
                
                
                plateau.afficherGrilleSurConsole();
                joueurCourant = listeJoueurs[p];

                System.out.println("A " + joueurCourant + " (couleur " + joueurCourant.getCouleur() + " de jouer )");
                System.out.println(joueurCourant.getReserveJetons().size() + " jetons restant"); //on utilise la fonction size() pour indiquer le nombre de jetons restants
                System.out.println("Sur qu'elle colonne voulez vous jouez ?"
                        + "\nEntrer un chiffre entre 1 et 7");
                int col = sc.nextInt() - 1;
                if (col > 6 | col < 0) {
                    System.out.println("Cette colonne n'existe pas, Choisisser une autre colonne");
                } else {
                    if (plateau.presenceJeton(0, col)) {
                        System.out.println("La colonne est plein"
                                + "\nIl faut choisir une autre colonne");
                    } else {
                        for (int i = 5; i > 0; i--) {
                            if (!plateau.presenceJeton(i, col)) {
                                int ligne = i;

                            }
                        }
                        Jeton jetonCourant = joueurCourant.jouerJeton();
                        plateau.ajouterJetonDansColonne(jetonCourant, col);
                        System.out.println("Votre jeton a ete joue");

                    }
                }
                if(plateau.etreGagnantePourCouleur(joueurCourant.donnerCouleur())){
                    
                    test = 1;
                    break;
                }
            }
        }

    }
}
