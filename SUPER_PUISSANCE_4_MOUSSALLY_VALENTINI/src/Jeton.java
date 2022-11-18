/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class Jeton {
    private String Couleur;
    
    public String lireCouleur() {
        return Couleur;
    }
   @Override
public String toString() {
    String C;
    if (Couleur=="rouge"){
        return "R";
        
    }
    else{
        return "J";
    }
}
}
