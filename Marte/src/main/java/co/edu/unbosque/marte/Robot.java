/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import co.edu.unbosque.marte.Movimiento;
import co.edu.unbosque.marte.Coordenada;



/**
 *
 * @author F211
 */
public class Robot {
    Coordenada coord;
    Movimiento m;
    public Robot(Coordenada c) {
        this.coord=c;
     }

    public void ejecutar(char c) {
        if (c=='I' || c=='D') {
        if(c=='I'){
            switch (this.coord.getOrientacion()){
                case 'N': this.coord.setOrientacion('O');
                case 'O': this.coord.setOrientacion('S');
                case 'S': this.coord.setOrientacion('E');
                case 'E': this.coord.setOrientacion('N');
            }
        } else if (c=='D'){
            switch (this.coord.getOrientacion()){
                case 'N': this.coord.setOrientacion('E');
                case 'O': this.coord.setOrientacion('N');
                case 'S': this.coord.setOrientacion('O');
                case 'E': this.coord.setOrientacion('S');
            }
        }
    }else if (c=='A'){
        switch (this.coord.getOrientacion()){
                case 'O': this.coord.setX(this.coord.getX()-1);break;
                case 'E': this.coord.setX(this.coord.getX()+1);break;
                case 'N': this.coord.setY(this.coord.getY()+1);break;
                case 'S': this.coord.setY(this.coord.getY()-1);break;
            }
    }
    }

    public Coordenada getCoordenada() {
        return this.coord;
    }
    
}
