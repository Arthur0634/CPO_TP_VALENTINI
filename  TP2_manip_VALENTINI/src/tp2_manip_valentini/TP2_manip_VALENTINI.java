/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_valentini;

/***
 *
 * @author arthu
 */
public class TP2_manip_VALENTINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;//il y a 3 tartiflettes créent mais la 2 et la toris ont la meme valeur on la crée pourpouvoir inverser
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbcalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbcalories) ;
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbcalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbcalories) ;
        
        //Moussaka assiette666 = assiette1 ; la ligne n'est pas correcte car l'assiette 1 est une tartiflette et non une moussaka
        //Moussaka assiette667 = new Tartiflette() ; la ligne n'est pas correcte car on cree une tartiflette pour une assiette de moussaka
        
    Moussaka Tab [] = new Moussaka[10];
    for (int i=0;i<10;i++){
        Tab[i]=new Moussaka(i);
        }

    }
    
}
