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
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;

    
public CelluleDeGrille (Jeton j)   {   //on affecte des valeurs de bases
        jetonCourant = j;
    }
public boolean presenceJeton () {  //permet de savoir si le jeton est present ou non
        if(jetonCourant != null){
            return true;
        }                 
        return false;
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

public Jeton recupererJeton() { //on pense a creer une variable temporaire pour permettre de conserver le jeton
        Jeton jeton_enleve;
        jeton_enleve = jetonCourant;
        jetonCourant=null;
        return jeton_enleve;
}

public void placerTrouNoir() {
    avoirTrouNoir=true;
    
}

public void supprimerTrouNoir() {
    avoirTrouNoir=false;
    
}

public boolean presenceTrouNoir() {
    if (avoirTrouNoir==false) {
        return (false);
    }
    else {
        return(true);
    }
}

public void supprimerJeton(){
    jetonCourant=null;
}

public boolean presenceDesintegrateur() {
    if (avoirDesintegrateur==false) {
        return(false);
        
    }
    else {
        return(true);
    }
}

public void placerDesintegrateur() {
    avoirDesintegrateur=true;
    
}

public void supprimerDesintegrateur() {
    avoirDesintegrateur=false;
}

public void activerTrouNoir() {
    supprimerJeton();
    supprimerTrouNoir();
}
    @Override
    public String toString() {
        if (jetonCourant != null) {
            if (jetonCourant.lireCouleur().equals("jaune")) {
                return ("J");
            }
            if (jetonCourant.lireCouleur().equals("rouge")) {
                return ("R");
            }
        }
        
        
        return (".");

    }


}
    
            

