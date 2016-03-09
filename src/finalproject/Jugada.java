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
public class Jugada {
    
    
    String nombre;
    String set;
    String jugador;
    String scoreActual;
    
    public Jugada(String jugador, String nombre, int set, int score){
    
    this.nombre = nombre;
    this.set = Integer.toString(set);
    this.jugador = jugador;
    this.scoreActual = Integer.toString(score);
    
    }
    
    public String toString(){
return this.nombre;
}

    
    
    
}
