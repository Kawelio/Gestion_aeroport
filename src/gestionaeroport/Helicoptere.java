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
public class Helicoptere extends Aeronef{
    public Helicoptere(String immatriculation, int vitesse, int consomme, int reservoir) {
        super(immatriculation, vitesse, consomme, reservoir);
    }
    
    @Override
    public String toString(){
        return "Helicoptere -- " + super.toString();
    }

    @Override
    public void pleinCarburant() {
        
    }

    @Override
    public void deplacementAeronef() {
        
    }

    @Override
    public void stationnementAeronef() {
        
    }

    @Override
    public void carburantRestant() {
        
    }
}
