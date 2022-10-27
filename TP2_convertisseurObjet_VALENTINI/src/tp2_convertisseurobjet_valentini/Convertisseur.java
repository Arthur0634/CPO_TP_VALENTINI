/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_valentini;

/**
 *
 * @author arthu
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
    int nbConversions = 0 ;
 
}
    public double CelciusVersKelvin (double temp) {
        nbConversions++;
        return temp+273.15;
    }

    public double KelvinVersCelcius (double temp) {
       nbConversions++;
        return temp-273.15;
    }

    public double FarenheitVersCelcius (double temp) {
        nbConversions++;
        return (temp-32)*9/5;  
    }

    public double CelciusVersFarenheit (double temp) {
        nbConversions++;
        return (temp*5/9+32);
    }

    public double FarenheitVersKelvin (double temp) {
        nbConversions++;
        return (temp+459.67)*9/5;    
    }

    public double KelvinVersFarenheit (double temp) {
        nbConversions++;
        return(temp*5/9)-459.67;  
    }

    @Override
    public String toString () {
     return "nb de conversions"+ nbConversions;
    }

}


   