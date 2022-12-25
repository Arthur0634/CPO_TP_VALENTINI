/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_off_moussally_valentini;

/**
 *
 * @author arthu
 */
public class Grille {

    CelluleLumineuse[][] Plateau ;//on crée un tablea de 5 lignes et 5 colonnes qui contient les 25 cellules lumineuses
    int TailleGrille = 5;
 
    public Grille(int TailleGrilleACreer)
    {
        TailleGrille = TailleGrilleACreer;
        Plateau = new CelluleLumineuse[TailleGrille][TailleGrille];
        for (int i = 0; i < TailleGrille; i++) { //on balaye chaque cellule du tableau 
            for (int j = 0; j < TailleGrille; j++) {
                Plateau[i][j] = new CelluleLumineuse();
            }
        }
        
    }

    public boolean Grille_vide() {
        boolean verif = false;
        for (int i = 0; i < TailleGrille; i++) { //on balaye chaque cellule du tableau 
            for (int j = 0; j < TailleGrille; j++) {
                if (Plateau[i][j].est_allume() == true) { //si une cellule est allumé , la variable verif va passer a true 
                    verif = true; //on se servira de se resultat plus tard , il faudra a chaque coup verifier si la grille est vide 
                    //cad verifier si verif est egale a false 
                }
            }
        }
        return verif != true; //si rien n'est allumé , alors tout est eteint 
    }
    
    public  CelluleLumineuse[][] getCellules(){
        return Plateau;
    }
            

    public void change(int i, int j) {//cette methode permet de d'allumer ou d'eteindre la case que l'on souhaite
        if (i >= 0 && i < TailleGrille && j >= 0 && j < TailleGrille) {//on verifie que i et j corrspondent bien a une cellule du tableau 
            Plateau[i][j].change();
        }
    }
    public void clic (int i,int j){// cette methode permet de changer toute les cases autour de la case cliqué
        change(i,j);
        change(i+1,j);
        change(i-1,j);
        change(i,j+1);
        change(i,j-1);
    }
    

}
