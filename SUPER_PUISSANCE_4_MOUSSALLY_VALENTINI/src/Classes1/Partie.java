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
    private PlateauDeJeu plateau;

    public void Partie(Joueur joueur1, Joueur joueur2) {
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
        boolean fini = false;
        while (fini == false) { //tant que la partie n'est pas finie
            Scanner sc;
            int colonneJouee;
            sc = new Scanner(System.in);
            plateau.afficherGrilleSurConsole();
            System.out.println("A " + joueurCourant + " (couleur " + joueurCourant.getCouleur() + "de jouer )");
            System.out.println(joueurCourant.getReserveJetons().size() + " jetons restant"); //on utilise la fonction size() pour indiquer le nombre de jetons restants
            System.out.println("Quelle colonne choisissez vous ? (1 a 7)");
            colonneJouee = sc.nextInt(); //saisie sur l'interface
            int ligneJouee;
            ligneJouee = plateau.ajouterJetonDansColonne(joueurCourant.getReserveJetons().get(0), colonneJouee - 1);
            while (ligneJouee == 99) { //tant que le joueur joue sur une colonne pleine, on lui demande de rejouer
                System.out.println("Erreur: la colonne est pleine");
                System.out.println("Quelle colonne choisissez vous ? (1 a 7)");
                colonneJouee = sc.nextInt(); //saisie sur l'interface
                ligneJouee = plateau.ajouterJetonDansColonne(joueurCourant.getReserveJetons().get(0), colonneJouee - 1);
            }
            System.out.println("pion place dans la ligne numero " + ligneJouee);
            joueurCourant.jouerJeton();//si la colonne n'est pas pleine on enleve le jeton place de la reserve du joueur 

            if (plateau.etreGagnantePourCouleur(joueurCourant.getCouleur())) {
                fini = true;
                System.out.println("Felicitations, le joueur " + joueurCourant + " a gagne");
            }
            if (plateau.grilleRemplie()) {
                System.out.println("La grille est pleine: fin de partie");
                fini = true;
            }

            if (joueurCourant == listeJoueurs[0]) {
                joueurCourant = listeJoueurs[1];
            } else if (joueurCourant == listeJoueurs[1]) {
                joueurCourant = listeJoueurs[0];
            } //on inverse le joueur courant
        }
    }

}
