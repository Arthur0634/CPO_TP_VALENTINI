package Classes1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author arthu
 */
public class PlateauDeJeu {

    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];//on initialise un tebleau de 42 cases qui represente le plateau de jeu

    public PlateauDeJeu() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grille[i][j] = new CelluleDeGrille(null);
            }
        }
    }

    public int ajouterJetonDansColonne(Jeton jeton, int colonne) {
        for (int ligne = 5; ligne > -1; ligne--) {
            if (grille[ligne][colonne].presenceJeton() == false) {
                grille[ligne][colonne].affecterJeton(jeton); //si la case du bas est libre, on y ajoute le jeton
                return ligne; //puis on retourne l'indice de la ligne
            }
        }
        return -1; //en cas d’erreur
    }

    public boolean grilleRemplie() {
        for (int i = 0; i < 6; i++) {//on parcour les lignes du tableau une par une
            for (int j = 0; j < 7; j++) {//on parcour les colonnes du tableau une par une
                if (grille[i][j].presenceJeton() == false) {//verifie si il y a un jeton dans la case ij sur la grille
                    return false; //retourne false si il n'y a pas de jeton 
                }
            }
        }
        return true;//sinon on retourne true
    }

    public boolean colonneremplies(int a) {//methode qui verifie si les colonne sont remplies de jetons 
        boolean res = true;
        if (grille[5][a].presenceJeton() == false) {
            res = false;
            return res;
        }
        return res;
    }

    public String lireCouleurDuJeton(int x, int y) {
        return grille[x][y].lireCouleurDuJeton();// lit et retourne la couleur de la case ij
    }
    
    
    public boolean ligneGagnantePourCouleur(String couleur_gagnante) {
        for (int i = 0; i < 6; i++) {//i est la ligne, j la colone
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i][j + 1].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i][j + 2].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i][j + 3].lireCouleurDuJeton().equals(couleur_gagnante)) {
                    return (true);
                }
            }

        }
        return (false);
    }

    public boolean colonneGagnantePourCouleur(String couleur_gagnante) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i + 1][j].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i + 2][j].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i + 3][j].lireCouleurDuJeton().equals(couleur_gagnante)) {
                    return (true);
                }
            }

        }
        return (false);
    }

    public boolean diagonaleMontanteGagnantePourCouleur(String couleur_gagnante) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante)
                        & grille[i + 1][j + 1].lireCouleurDuJeton().equals(couleur_gagnante)
                        & grille[i + 2][j + 2].lireCouleurDuJeton().equals(couleur_gagnante)
                        & grille[i + 3][j + 3].lireCouleurDuJeton().equals(couleur_gagnante)) {
                    return (true);
                }
            }

        }
        return (false);
    }

    public boolean diagonaleDescendanteGagnantePourCouleur(String couleur_gagnante) {
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (grille[i][j].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i - 1][j + 1].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i - 2][j + 2].lireCouleurDuJeton().equals(couleur_gagnante) & grille[i - 3][j + 3].lireCouleurDuJeton().equals(couleur_gagnante)) {
                    return (true);
                }
            }

        }
        return (false);
    }

    public boolean etreGagnantePourCouleur(String couleur_gagnante) {
        if (diagonaleDescendanteGagnantePourCouleur(couleur_gagnante) == true | diagonaleMontanteGagnantePourCouleur(couleur_gagnante) == true | colonneGagnantePourCouleur(couleur_gagnante) == true | ligneGagnantePourCouleur(couleur_gagnante) == true) {
            return (true);
        }
        return (false);
    }

    public void afficherGrilleSurConsole() {
        String afficher_ligne = "";
        for (int i = 0; i < 6; i++) {
            afficher_ligne = "";
            for (int j = 0; j < 7; j++) {
                afficher_ligne += "[" + grille[i][j].toString() + "]";
            }
            System.out.println(afficher_ligne);
        }
    }

    public boolean presenceJeton(int x, int y) {
        return (grille[x][y].presenceJeton());
    }
    
    public boolean presenceTrouNoir(int x,int y) {
        return (grille[x][y].presenceTrouNoir());
    }
    public void placerTrouNoir(int x,int y) {
        grille[x][y].presenceTrouNoir();
    }
    public void supprimerTrouNoir(int x,int y) {
        grille[x][y].supprimerTrouNoir();
    }
    public void placerDesintegrateur(int x,int y) {
        grille[x][y].presenceDesintegrateur();
    }
    public void supprimerDesintegrateur(int x,int y) {
        grille[x][y].supprimerDesintegrateur();
    }
    public boolean presenceDesintegrateur(int x,int y) {
        return(grille[x][y].presenceDesintegrateur());
    }
    public void supprimerJeton(int x,int y) {
        grille[x][y].supprimerJeton();
    }
    public Jeton recupererJeton(int x, int y) {
        return grille[x][y].recupererJeton();
    }
}

