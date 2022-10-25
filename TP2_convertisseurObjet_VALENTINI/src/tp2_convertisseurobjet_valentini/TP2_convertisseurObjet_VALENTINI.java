/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_valentini;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP2_convertisseurObjet_VALENTINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Convertisseur Convert1 = new Convertisseur(); 
        Convert1.CelciusVersFarenheit(Convert1.KelvinVersCelcius(145));
        Convert1.FarenheitVersKelvin(65);
        Convert1.KelvinVersCelcius(Convert1.FarenheitVersKelvin(330));
        Convert1.CelciusVersKelvin(115);
        
        Convertisseur Convert2 = new Convertisseur();
        Convert2.KelvinVersCelcius(100);
        Convert2.CelciusVersFarenheit(Convert2.KelvinVersCelcius(300));
        Convert2.KelvinVersCelcius(76);

        Scanner sc = new Scanner(System.in);
        Convertisseur troisiemesConversions = new Convertisseur();
        System.out.println("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();
              
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"); 
        System.out.println("1) Celcius Vers Kelvin");
        System.out.println("2) Kelvin Vers Celcius");
        System.out.println("3) Farenheit Vers Celcius");
        System.out.println("4) Celcius Vers Farenheit");
        System.out.println("5) Kelvin Vers Farenheit");
        System.out.println("6) Farenheit Vers Kelvin");
        
        int convUtilisateur = sc.nextInt();
        double answer;
        
        if (convUtilisateur == 1) {
            answer = troisiemesConversions.CelciusVersKelvin(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
        }
       
        if (convUtilisateur == 2) {
            answer = troisiemesConversions.KelvinVersCelcius(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
        }
        
        if (convUtilisateur == 3) {
            answer = troisiemesConversions.FarenheitVersCelcius(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
        }
        
        if (convUtilisateur == 4) {
            answer = troisiemesConversions.CelciusVersFarenheit(valeur);
            System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
        }
        
        if (convUtilisateur == 5) {
            answer = troisiemesConversions.KelvinVersFarenheit(valeur);
            System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
        }
        
        if (convUtilisateur == 6) {
            answer = troisiemesConversions.FarenheitVersKelvin(valeur);
            System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");

        }
    
    }
}
