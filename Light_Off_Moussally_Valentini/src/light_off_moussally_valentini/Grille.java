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
}
