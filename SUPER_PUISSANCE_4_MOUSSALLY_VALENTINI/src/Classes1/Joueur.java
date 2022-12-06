package Classes1;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class Joueur {

    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons = new ArrayList();
    private int nombreDesintegrateurs;
    
    
    
    public Joueur(String name){
    
        nom=name;

    }
    
    
    public void affecterCouleur(String clr_s){
        couleur=clr_s;//on affecte une couleur a chaque joueur
    }
    
    public String donnerCouleur(){
        return couleur;//on renvoie la couleur 
    }
    
    
    public int nombreDeJetons(){
        int taille = reserveJetons.size();//la taille du tableau correspond au nombre de jetons car on a un jeton par case 
        return taille;
    }
    
    
    public void ajouterJeton(Jeton ajout){
        reserveJetons.add(ajout);//permet d'ajouter un jeton 
    }
    
    
    public Jeton jouerJeton (){
        int a = nombreDeJetons();
        Jeton j = reserveJetons.get(a-1);
        reserveJetons.remove(a-1);
        return j;
    }
    

    
    public String getCouleur() {
        return couleur;
    }

    public ArrayList<Jeton> getReserveJetons() {
        return reserveJetons;
    }
    
    public String ObtenirNom(){
        return(this.nom);
    }

  
    
}
