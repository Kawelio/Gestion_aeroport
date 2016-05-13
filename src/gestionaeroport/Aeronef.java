/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionaeroport;

/**
 *
 * @author Lucas_VN
 */
public abstract class Aeronef {
    
    private String immatriculation;
    private int vitesse;
    private int consomme;
    private int reservoir;
    
    public Aeronef (String immatriculation, int vitesse, int consomme, int reservoir){
        this.immatriculation = immatriculation;
        this.vitesse = vitesse;
        this.consomme = consomme;
        this.reservoir = reservoir;
    }
    
    public abstract void pleinCarburant();
    public abstract void carburantRestant();
    public abstract void deplacementAeronef();
    public abstract void stationnementAeronef();
    
    @Override
    public String toString(){
        return "immatriculation : " + this.immatriculation + ", vitesse : " + this.vitesse + 
                "km/h, consommation : " + this.consomme +
                "L/h et à un réservoir de " + this.reservoir + ".";
    }
}
