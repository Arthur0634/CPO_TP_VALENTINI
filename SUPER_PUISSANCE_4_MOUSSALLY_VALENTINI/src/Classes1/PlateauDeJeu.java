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
    for (int i = 0;i<6;i++){//on parcours les lignes du tableau une par une
        for (int j = 0;j<7;j++){//on parcours les colonne du tableau une par une
            if (grille[i][j].presenceJeton()==false){//on verifie si il y a un jeton sur  la case ij de la grille
                    return false; //si il n'y a pas de jeton on retourne false
            }        
        }
    }
    return true;//si il y a un jeton on retourne true
    
    
}
public String lireCouleurDuJeton(int x, int y){
    return grille[x][y].lireCouleurDuJeton();// cette fonction permet de lire et de retourner la couleur de la case ij
}

public boolean ligneGagnantePourCouleur(String couleur){
    for (int i = 0;i<6;i++){//on parcours les lignes du tableau une par une en allant jusqu'a la troisieme ligne car il faut un allignement de 4 jeton de meme couleur et apres la 3 case de la ligne ce n'est plus possible
        for (int j = 0;j<4;j++){//on parcours les colonne du tableau une par une
            if (grille[i][j].lireCouleurDuJeton().equals(couleur) && grille[i][j+1].lireCouleurDuJeton().equals(couleur) && grille[i][j+2].lireCouleurDuJeton().equals(couleur) && grille[i][j+3].lireCouleurDuJeton().equals(couleur)){ //on regarde si les 4 cases sont de meme couleur une a une sur la ligne
                    return true; //on retourne true si elles sont toutes les 4 de la meme couleur
            }
        }
    }
             return false; //si on n'a trouve aucune case gagnante, on retourne false
   
} 

public boolean colonneGagnantePourCouleur(String couleur){
         for (int i=0;i<3;i++){//on parcours les colonnes du tableau une par une en allant jusqu'a la quatrieme colonne car il faut un allignement de 4 jetons de meme couleur et apres la 4 case de la colonne ce n'est plus possible
             for (int j=0;j<7;j++){//on parcours les lignes du tableau une par une
                 
                if (grille[j][i].lireCouleurDuJeton().equals(couleur) && grille[j][i+1].lireCouleurDuJeton().equals(couleur) && grille[j][i+2].lireCouleurDuJeton().equals(couleur) && grille[j][i+3].lireCouleurDuJeton().equals(couleur)){ //on verifie si les 4 aligne sur la meme colonne sont de meme couleur 
                    return true; //on retourne true si les 4 cases aligne sont de meme couleur
                }                                     
                     
             }
         }
         return false; //si on n'a trouve aucune case gagnante, on retourne false
     }



}
