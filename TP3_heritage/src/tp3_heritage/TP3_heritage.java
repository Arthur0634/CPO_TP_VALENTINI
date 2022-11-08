/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage;

import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class TP3_heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        epée pago=new epée("Excalibur",7,5);
        epée paga=new epée("Durandal",4,7);
        Baton benoi=new Baton("Chêne",4,5);
        Baton nafel=new Baton("Charme", 5, 6);
        ArrayList<Armes> tab= new ArrayList<Armes>();
        tab.add("pago");
        tab.add("paga");
        tab.add("benoi");
        tab.add("nafel");
    
        // TODO code application logic here
    }
    
}
