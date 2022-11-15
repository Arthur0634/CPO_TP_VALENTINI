/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;

import tp3_heritage.armes.epée;
import tp3_heritage.armes.Baton;
import tp3_heritage.armes.Armes;
import java.util.ArrayList;
import tp3_heritage.personnage.Guerrier;
import tp3_heritage.personnage.magicien;
import tp3_heritage.personnage.personnage;

/**
 *
 * @author arthu
 */
public class TP3_heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        epée Excalibur=new epée("Excalibur",7,5);
        epée Durandal=new epée("Durandal",4,7);
        Baton Chêne=new Baton("Chêne",4,5);
        Baton Charme=new Baton("Charme", 5, 6);
        ArrayList<Armes> tab= new ArrayList<Armes>();
        tab.add(Excalibur);
        tab.add(Durandal);
        tab.add(Chêne);
        tab.add(Charme);
        
        magicien Gandalf=new magicien("Gandalf",65,true);
        magicien Garcimore=new magicien("Garcimore",44,false);
        Guerrier Conan=new Guerrier("Conan", 78,false);
        Guerrier Lannister=new Guerrier("Lannister", 45, true);
        ArrayList<personnage> tab2= new ArrayList<personnage>();
        tab2.add(Gandalf);
        tab2.add(Garcimore);
        tab2.add(Conan);
        tab2.add(Lannister);
        
        
        
                
    
        // TODO code application logic here
    }
    
}
