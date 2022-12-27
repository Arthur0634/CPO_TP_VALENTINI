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

    public void placerTrousNoirsEtDesintegrateurs() {

        double alea;

        int ligne;

        int colonne;

        for (int i = 0; i < 3; i++) { //on place d'abord 3 trous noirs et 3 desintegrateurs caches dedans

            alea = Math.random() * 6; //on genere un double aleatoire entre 0 et 6

            ligne = (int) alea; //puis on recupere la partie entiere de ce double pour avoir un indice de ligne aleatoire

            //pareil pour les colonnes
            alea = Math.random() * 7;

            colonne = (int) alea;

            while (plateau.presenceTrouNoir(ligne, colonne) == true) { //tant que les coordonnees tires sont celles d'une case deja remplie, on recommence

                alea = Math.random() * 6;

                ligne = (int) alea;

                alea = Math.random() * 7;

                colonne = (int) alea;

            }

            plateau.placerTrouNoir(ligne, colonne);

            plateau.placerDesintegrateur(ligne, colonne);

        }

        for (int i = 0; i < 2; i++) {//on place ensuite les 2 desintegrateurs

            alea = Math.random() * 6;

            ligne = (int) alea;

            alea = Math.random() * 7;

            colonne = (int) alea;

            while (plateau.presenceDesintegrateur(ligne, colonne) == true) { //tant que les coordonnees tires sont celles d'une case deja remplie, on recommence

                alea = Math.random() * 6;

                ligne = (int) alea;

                alea = Math.random() * 7;

                colonne = (int) alea;

            }

            plateau.placerDesintegrateur(ligne, colonne);

        }

        for (int i = 0; i < 2; i++) {//on place ensuite les 2 derniers trous noirs

            alea = Math.random() * 6;

            ligne = (int) alea;

            alea = Math.random() * 7;

            colonne = (int) alea;

            while (plateau.presenceDesintegrateur(ligne, colonne) == true || plateau.presenceTrouNoir(ligne, colonne) == true) { //les 2 trous noirs doivent etre poses sur une case sans desintegrateur ni trou noir

                alea = Math.random() * 6;

                ligne = (int) alea;

                alea = Math.random() * 7;

                colonne = (int) alea;

            }

            plateau.placerTrouNoir(ligne, colonne);

        }

    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }

    public void lancerPartie() {

        joueurCourant = listeJoueurs[0];//le joueur classé en premier comence
        boolean fini = true;
        boolean recupOK = false;
        int test = 0;
        boolean sauterTour = false;

        while (fini) { //tant que la partie n'est pas finie

            if (test == 1) {
                System.out.println(joueurCourant.ObtenirNom() + " a gagne");
                plateau.afficherGrilleSurConsole();
                break;
            }
            Scanner sc;
            int colonneJouee;
            int ligne = 111;

            sc = new Scanner(System.in);
            for (int p = 0; p < 2; p++) {
                if (sauterTour == true) {
                    plateau.afficherGrilleSurConsole();
                    sauterTour=false;
                } else {
                    plateau.afficherGrilleSurConsole();
                    joueurCourant = listeJoueurs[p];
                }

                System.out.println("A " + joueurCourant + " (couleur " + joueurCourant.getCouleur() + " de jouer )");
                System.out.println(joueurCourant.getReserveJetons().size() + " jetons restant"); //on utilise la fonction size() pour indiquer le nombre de jetons restants
                System.out.println("que voulez vous faire? \n1) pour placer jeton \n2) pour recuperer jeton \n3) pour desintegrer");
                int rep = sc.nextInt();
                if (rep == 1) { //on va creer trois cas possible a chaque coups jouer
                    System.out.println("Sur qu'elle colonne voulez vous jouez ?"
                            + "\nEntrer un chiffre entre 1 et 7");
                    int col = sc.nextInt() - 1;

                    while (col > 6 | col < 0) {
                        System.out.println("Cette colonne n'existe pas, Choisisser une autre colonne");
                        System.out.println("Sur qu'elle colonne voulez vous jouez ?"
                                + "\nEntrer un chiffre entre 1 et 7");
                        col = sc.nextInt() - 1;
                    }
                    if (plateau.presenceJeton(0, col)) {
                        System.out.println("La colonne est plein"
                                + "\nIl faut choisir une autre colonne");
                    } else {
                        for (int i = 5; i > -1; i--) {
                            if (!plateau.presenceJeton(i, col)) {
                                ligne = i;
                                break;

                            }

                        }
                        Jeton jetonCourant = joueurCourant.jouerJeton();
                        System.out.println(ligne);
                        if (plateau.presenceTrouNoir(ligne, col)) {
                            plateau.supprimerTrouNoir(ligne, col);
                            plateau.supprimerJeton(ligne, col);
                        } else {
                            plateau.ajouterJetonDansColonne(jetonCourant, col);
                            System.out.println("Votre jeton a bien ete joue");
                        }
                        if (plateau.presenceDesintegrateur(ligne, col)) {
                            joueurCourant.ObtenirDesintegrateur();
                            plateau.supprimerDesintegrateur(ligne, col);
                            System.out.println(joueurCourant.acessDesintegrateur());
                        }

                    }

                }
                if (rep == 2) {
                    int ligneJouee = 9; //idee empruntée 
                    colonneJouee = 9; //pareil

                    recupOK = false;

                    while (recupOK == false) {

                        recupOK = true;//on part du principe que le joueur veut recuperer une case valide

                        System.out.println("Sur quelle colonne est le jeton que vous voulez enlever (1 a 7)?");

                        colonneJouee = sc.nextInt();

                        System.out.println("Sur quelle ligne est le jeton que vous voulez recuperer? (1 a 6)");

                        ligneJouee = sc.nextInt();

                        if ((colonneJouee <= 0) || (colonneJouee >= 8) || (ligneJouee <= 0) || (ligneJouee >= 7)) {  //tant que l'utilisateur comprend que dalle, on lui redemande                      

                            System.out.println("Colonne de 1 a 7 et ligne de 1 a 6");

                            recupOK = false;

                        }

                        if (recupOK == true) { //si on a passe la premiere verification

                            if (plateau.lireCouleurDuJeton(ligneJouee - 1, colonneJouee - 1) != joueurCourant.getCouleur()) { //tant que le joueur ne joue pas sur un jeton qu'il possede

                                System.out.println("Il n'y a pas de jeton a vous sur  cette case.");

                                recupOK = false;

                            }

                        }

                    }

                    joueurCourant.ajouterJeton(plateau.recupererJeton(ligneJouee - 1, colonneJouee - 1)); //on enleve le jeton et on le redonne au joueur

                    plateau.tasserColonne(colonneJouee - 1);

                } else if (rep == 3) {
                    if (joueurCourant.acessDesintegrateur() != 0) {
                        System.out.println("choisissez la ligne de la case que vous voulez desintegrer");
                        int ligned = sc.nextInt();
                        System.out.println("choisissez la colonne de la case que vous voulez desintegrer");
                        int colonned = sc.nextInt();
                        plateau.supprimerJeton(ligned - 1, colonned - 1);
                        joueurCourant.utiliserDesintegrateur();
                        plateau.tasserColonne(colonned - 1);
                    } else {
                        System.out.println("vous n'avez pas de desintegrateur.");
                        sauterTour = true;
                    }

                }

                if (plateau.etreGagnantePourCouleur(joueurCourant.donnerCouleur())) {

                    test = 1;
                    break;
                }
            }
        }

    }

}
