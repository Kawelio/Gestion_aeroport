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
public class NbNegatifException extends Exception {
    
    private static final String message = "erreur : nombre d'aeroport négatifs";
    
    public NbNegatifException(){
        super(message);
    }
}
