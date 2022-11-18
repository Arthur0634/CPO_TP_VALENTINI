package Classes1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class CelluleDeGrille {
    Jeton jetonCourant;
    private boolean avoirTrouNoir;  //on creer nos variables
    private boolean avoirDesintegrateur;
    
public CelluleDeGrille ()   {   //on affecter des valeurs de bases
        jetonCourant = null;
        avoirTrouNoir= false;
        avoirDesintegrateur=false;
    }
public boolean presenceJeton () {  //permet de savoir si le jeton est present ou non
    if (jetonCourant==null) {
        return false;
    }
    else {
        return true;
    }
                  
}

public void affecterJeton(Jeton jeton){ 
    this.jetonCourant=jeton;

}



}
    
            

