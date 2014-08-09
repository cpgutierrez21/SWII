/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

/**
 *
 * @author F211
 */
 public class Movimiento {
     
     String movimientos;
     char mov[];
     int i;

    public Movimiento(String movimientos) {
        if(movimientos.isEmpty())
            throw new IllegalArgumentException("Los movimientos no pueden estar vacios");
        if(!movimientos.matches("[IAD]*"))
            throw new IllegalArgumentException("Los movimientos tienen caracteres invalidos");
        
        this.movimientos=movimientos;
        i=-1;
    }

    public char getNextMov() {
        mov=this.movimientos.toCharArray();
        i++;
        return mov[i];
    }
    
}
