/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionaeroport;
import java.util.*;

/**
 *
 * @author Lucas_VN
 */
public class Aeroport {
    private String nom;
    private int x;
    private int y;
    private List<Aeronef> parking = new ArrayList<>();
    private List<Helicoptere> heliport = new ArrayList<>();
    
    
    public Aeroport (String nom, int x, int y){
        this.parking = parking;
        this.heliport = heliport;
        this.nom = nom;
        this.x = x;
        this.y = y;
    }
    
    public void AddAeronefToParking(Avion a){
        this.parking.add(a);
    }
    
    public void AddHelicoptereToHeliport(Helicoptere h){
        this.heliport.add(h);
    }
    
    public void ListAeronefToParking(){
        for (int i = 0; i < parking.size(); i++){
            System.out.println(parking.get(i));
        }
    }
    
    public void ListHelicopterToHeliport(){
        for (int i = 0; i < heliport.size(); i++){
            System.out.println(heliport.get(i));
        }
    }
   
    @Override
    public String toString(){
        return "Aeroport -- nom  : " + this.nom +
                ", position : " + this.x +
                "," + this.y + ".";
    }
}
