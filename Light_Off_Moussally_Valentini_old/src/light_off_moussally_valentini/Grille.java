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

    CelluleLumineuse[][] Plateau = new CelluleLumineuse[5][5];//on crée un tablea de 5 lignes et 5 colonnes qui contient les 25 cellules lumineuses
    boolean verif = false;
    int TailleGrille = 5;

    public boolean Grille_vide() {
        for (int i = 0; i < 5; i++) { //on balaye chaque cellule du tableau 
            for (int j = 0; j < 5; j++) {
                if (Plateau[i][j].est_allume() == true) { //si une cellule est allumé , la variable verif va passer a true 
                    verif = true; //on se servira de se resultat plus tard , il faudra a chaque coup verifier si la grille est vide 
                    //cad verifier si verif est egale a false 
                }
            }
        }
        return verif != true; //si rien n'est allumé , alors tout est eteint 
    }

    public void change(int i, int j) {//cette methode permet de d'allumer ou d'eteindre la case que l'on souhaite
        if (i >= 0 | i < TailleGrille |j >= 0 | j < TailleGrille) {//on verifie que i et j corrspondent bien a une cellule du tableau 
            Plateau[i][j].change();
        }
    }
    public void clic (int i,int j){// cette methode permet de changer toute les cases autour de la case cliqué
        Plateau[i][j].change();
        Plateau[i+1][j].change();
        Plateau[i-1][j].change();
        Plateau[i][j+1].change();
        Plateau[i][j-1].change();
    }
    

}
