/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_valentini;

/**
 *
 * @author arthu
 */
public class TP2_Bieres_VALENTINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
    
    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",
6.6 ,"Abbaye de Leffe") ;
    deuxBiere.lireEtiquette();
    
    BouteilleBiere troisBiere = new BouteilleBiere("Badoit",
5.7 ,"Baba") ;
    troisBiere.lireEtiquette();
    
    BouteilleBiere quatreBiere = new BouteilleBiere("Chateaubriand",
10 ,"Le manoir") ;
    quatreBiere.lireEtiquette();
    
    quatreBiere.Decapsuler();
    
    System.out.println(quatreBiere);
    System.out.println();




    }


  // TODO code application logic here
    }
 

