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
public class Coordenada {

    private int x;
    private int y;
    private char orientacion;
   public  Coordenada(int x, int y, char orientacion) {
       if(x<0 || y<0)
           throw  new IllegalArgumentException("Coordenadas x,y invalidas");
       String tmp=""+orientacion;
       if (!tmp.matches("[NSEO]*"))
           throw new IllegalArgumentException("Orientacon no valida");
       this.x=x;
       this.y=y;
       this.orientacion=orientacion;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the orientacion
     */
    public char getOrientacion() {
        return orientacion;
    }

    /**
     * @param orientacion the orientacion to set
     */
    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
}
