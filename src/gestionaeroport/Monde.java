/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionaeroport;
import gestionaeroport.Aeronef;
import gestionaeroport.Avion;
import java.util.*;

/**
 *
 * @author Lucas_VN
 */
public class Monde {
    private String immatriculation;
    private int immatriculea = 1;
    private int immatriculeh = 1;
    private List<Aeroport> learoport;
    
    public Monde(){
        learoport = new ArrayList<>();
        int nb = 0;
        try {
            nb = demanderNbAeroport();
        } catch (NbNegatifException e) {
            System.err.println(e.getMessage());
            //☺nb = Math.abs(nb);
            nb = 1;
        }
        remplir(nb);
    }
    
    public int demanderNbAeroport() throws NbNegatifException {
        System.out.println("Combien d'aéroports voulez vous créer ?");
        int sc = new Scanner(System.in).nextInt();
        if (sc < 0) {
            throw new NbNegatifException();
        }
        return sc;
    }
    
    public void remplir(int nb){
        for(int i = 0; i < nb; i++){
            ajouterAeroport();
        }
    }
    
    public void ajouterAeroport(){
        int scx;
        int scy;
        System.out.println("Veuillez saisir le nom de votre aéroport :");
        String scae = new Scanner(System.in).nextLine();
        do{
            System.out.println("Veuillez saisir la coordonnée de x :");
            scx = new Scanner(System.in).nextInt();
        }while(scx>5000);
        do{
            System.out.println("Veuillez saisir la coordonnée de y :");
            scy = new Scanner(System.in).nextInt();
        }while(scy>5000);
        Aeroport aeo = new Aeroport(scae, scx, scy);
        for (int i = 0; i < 4; i++){
            immatriculation = "A" + immatriculea++;
            aeo.AddAeronefToParking(new Avion(immatriculation , 670, 54, 632));
        }
        for (int i = 0; i < 2; i++){
            immatriculation = "H" + immatriculeh++;
            aeo.AddHelicoptereToHeliport(new Helicoptere(immatriculation , 250, 9, 230));
        }
        if (aeo != null){
            learoport.add(aeo);
            System.out.println(aeo);
        }
    }
    
    public void afficherEtatMonde(){
        for (int i = 0; i < learoport.size(); i++){
            System.out.println("-------- Aeroport n°" + i+1 + "--------\n" + learoport.get(i));
            learoport.get(i).ListAeronefToParking();
            learoport.get(i).ListHelicopterToHeliport();
        }
    }
}
