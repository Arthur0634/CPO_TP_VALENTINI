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
        return jetonCourant != null;
                  
}

public void affecterJeton(Jeton jeton){ 
    this.jetonCourant=jeton;

}

public String lireCouleurDuJeton () {
    if (jetonCourant !=null){ //on verifie que le jeton est bien présent 
        return jetonCourant.lireCouleur();
    }
    else {
        return "vide";
    }
}


}
    
            

