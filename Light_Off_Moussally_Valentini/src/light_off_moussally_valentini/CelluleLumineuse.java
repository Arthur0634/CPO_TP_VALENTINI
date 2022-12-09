/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_off_moussally_valentini;

/**
 *
 * @author arthu
 */
public class CelluleLumineuse {

    boolean allume = false;
    
    public boolean est_allume() {//cette methode permet de savoir si la case est allumée ou pas?
        if (allume == true) {
            return true;
        } else {
            return false;
        }

    }
    
    public void change(){//cette methode permet de d'allumer ou d'eteindre la case que l'on souhaite
        if (allume==false){
            allume=true;
        }else{
            allume=false;
        }    
    }

}
