/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage.personnage;

/**
 *
 * @author arthu
 */
public class magicien extends personnage {
    boolean confirme;
    
    public magicien(String n, int i, boolean a){
        super(n , i );
        confirme =a;
    }
}
