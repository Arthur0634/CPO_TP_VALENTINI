/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_off_moussally_valentini;

/**
 *
 * @author arthu
 */
public class Joueur { // on creer une classe joueur afin de recuperer le nom du joueur
    private String nom;
    
    public Joueur (String name){
        nom=name;
    }
     public String obtenirNom(){
         return(this.nom);
     }
}
