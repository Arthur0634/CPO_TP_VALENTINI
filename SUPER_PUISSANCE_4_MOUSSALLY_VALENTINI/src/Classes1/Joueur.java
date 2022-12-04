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
    private ArrayList<Jeton> reserveJetons;
    private int nombreDesintegrateurs;
    
    
    
    public void Joueur (){
    
        nom="nom joueur pas enccore entré";//indique au joueur si il a rentre son nom
        couleur="couleur non initialisée";//indique si il a une couleur attribué
    }
    
    
    public void affecterCouleur(String clr_s){
        couleur=clr_s;//on affecte une couleur a chaque joueur
    }
    
    public String donnerCouleur(){
        return couleur;//on renvoie la couleur 
    }
    
    
    public int nombreDeJetons(){
        int taille = reserveJetons.size();//notre taille de tableau designe le nombre d ejtons comme il y a un jeton par case 
        return taille;
    }
    
    
    public void ajouterJeton(Jeton ajout){
        reserveJetons.add(ajout);//permet d'ajouter un jeton 
    }
    
    
    public Jeton jouerJeton (){
        int a = nombreDeJetons();
        Jeton j = reserveJetons.remove(a);
        return j;
    }
    
}
