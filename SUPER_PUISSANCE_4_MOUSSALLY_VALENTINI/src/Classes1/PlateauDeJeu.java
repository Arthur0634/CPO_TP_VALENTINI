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
    
CelluleDeGrille[][] grille = new CelluleDeGrille [6][7];//on initialise un tebleau de 42 cases qui represente le plateau de jeu
  

public  int ajouterJetonDansColonne(Jeton jeton, int colonne){
        for (int ligne = 0;ligne<6;ligne++){
            if (grille[ligne][colonne].presenceJeton()==false) {
                grille[ligne][colonne].affecterJeton(jeton); //si la case du bas est libre, on y ajoute le jeton
                return ligne; //puis on retourne l'indice de la ligne
            }              
        }
        return -1; //en cas d’erreur
    }

public boolean grilleRemplie(){
    
    
}

}
