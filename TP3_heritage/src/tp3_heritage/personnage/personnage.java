/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage.personnage;

/**
 *
 * @author arthu
 */
public class personnage {
    String Nomperso;
    int Vie;
    ArrayList<Armes> inventaire = new ArrayList<Armes>();
    Armes arme_en_main;
    
    public Personnage(String unNomPerso, int uneVie){
        NomPerso=unNomPerso;
        Vie=uneVie;
        arme_en_main = null;
    }
    
    public void ajouterArme (Armes arme_a_ajouter){
        if (inventaire.size()<5){
            inventaire.add(arme_a_ajouter);           
        }
    }
    
    public Armes getArme_en_main(){
        return arme_en_main;
    }
    
    public void EquipArme(String uneArme){
        for (int i=0; i<inventaire.size();i++){
            if (inventaire.get(i).getNom().equals(uneArme)){
                arme_en_main=inventaire.get(i);
                System.out.println("L'arme a bien ete affecte");
            }else{
                System.out.println("L'arme n'a pas ete trouvé");
            }
        }
    }
    
    @Override
    public String toString(){
        String chaine;
        chaine = "{Personnage: "+Nomperso+" Niveau de vie: "+Vie+"}";
        return chaine;
    }
    
}
