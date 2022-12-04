package Classes1;

import java.util.Random; //on importe le module Random
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class Partie {
    private Joueur [] listeJoueurs = new Joueur[2]; //on cree un tableau de joueurs
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;
    
    public void Partie(Joueur joueur1, Joueur joueur2){
        listeJoueurs [0]=joueur1;//on place les deux joueur dans le tableau de joueur
        listeJoueurs [1]=joueur2;
    }
    
    public void attribuerCouleurAuxJoueurs (){//on attribue une couleur aux joueurs
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(1);
        int temp;
        
        if (n==1){
            listeJoueurs[0].affecterCouleur("rouge");
            temp =0;
        }
        else{
            listeJoueurs[0].affecterCouleur("jaune");
            temp=1; 
        }
        
        if(temp==0){
            listeJoueurs[1].affecterCouleur("jaune");
        }
        else{
        listeJoueurs[1].affecterCouleur("rouge");
        }
        
}
        public void creerEtAffecterJeton (Joueur j_jeton){//on crée des jetons et on les affecte (commentaire tres utile)
        String clr_j = j_jeton.donnerCouleur();
        
         for (int i =0 ;i<=30;i++){ //on creer 30 jetons en previsions de si on ajoute les fonction trou noir et desintegrateur
             
             j_jeton.ajouterJeton(new Jeton(clr_j));
             
         }
    }
           
        public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs [0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        }

   
            public void lancerPartie(){
        Scanner saisieUtilisateur = new Scanner(System.in);


        Random generateurAleat = new Random();
        int jr = generateurAleat.nextInt(1);//permet de choisir de facon aleatoire quel joueur va commencer


        
        boolean victoire=false;//on initialise la victoire a false jusqu'a ce qu'elle passe true
}
}   

    
