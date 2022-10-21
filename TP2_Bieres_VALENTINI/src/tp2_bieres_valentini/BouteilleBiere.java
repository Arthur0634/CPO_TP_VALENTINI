/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_valentini;

/**
 *
 * @author arthu
 */
public class BouteilleBiere {
    String nom= new String();
    Double degreAlcool ;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
            " degres) \nBrasserie : " + brasserie ) ;
        
    }
    
    
    public BouteilleBiere(String unNom, double unDegre, String
        uneBrasserie) {
         nom = unNom;
         degreAlcool = unDegre;
         brasserie = uneBrasserie;
         ouverte = false;
        }
   
    public boolean Decapsuler(){
        if (ouverte ==false){
            ouverte = true;
            return true;
        }
        else{
            System.out.println("erreur: biere deja ouverte");
            return false;
        }
   }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + "(" + degreAlcool + " degrés) Ouverte ?";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
}
}

