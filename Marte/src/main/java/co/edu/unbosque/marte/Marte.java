/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

/**
 *
 * @author Cindy Gutierrez
 */
public class Marte {
    int x;
    int y;
    public Marte(int a, int b) {
        if(a<=0 || b<=0)
           throw  new IllegalArgumentException("dimensión de la matriz inválida");
        this.x=a;
        this.y=b;
    }
    
}
