/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage;

/**
 *
 * @author arthu
 */
public class Armes {
String  nom;
int niveau_attaque;

public Armes(String unnom, int niveauatq){
    nom=unnom;
    niveau_attaque=niveauatq;
    if (niveauatq>100){
        System.out.println("le niveau de l'arme est trop eleve");
        
    } else if (niveauatq<=0){
        System.out.println("le niveau de l'arme est trop bas");
    }else{
    System.out.println("le niveau de l'arme est "+ niveauatq);
    System.out.println("le nom de l'ame est: "+unnom);
    }
}
}

