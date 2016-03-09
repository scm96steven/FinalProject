/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Nelis Alcantara
 */
public class Jugador {
    
    String name;
    int[] score = {0,0,0};
    
    public Jugador(String name){ 
    this.name = name;
    }

public String toString(){
return this.name;
}


    
}
