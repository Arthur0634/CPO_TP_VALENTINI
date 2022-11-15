/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage.personnage;

/**
 *
 * @author arthu
 */
public class personnage {
String  nom;
int niveau_de_vie;

public int getniveau_de_vie(){
    return niveau_de_vie;
}

public void setniveau_de_vie(int niveau_de_vie){
    this.niveau_de_vie= niveau_de_vie;
}

public personnage(String unNom, int niveauvie){
    nom=unNom;
    niveau_de_vie=niveauvie;
}

public String tostring(){
    String chaine_a_retourner;
    chaine_a_retourner= nom+" ("+niveau_de_vie+"points de vie)";
    return chaine_a_retourner;
}   
}

    



