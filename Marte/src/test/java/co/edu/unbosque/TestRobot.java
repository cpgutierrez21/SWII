/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.Coordenada;
import co.edu.unbosque.marte.Robot;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestRobot {
    @Test
    public void seCreaElRobotEnUnaCoordenadaValida(){
        Coordenada c= new Coordenada(0, 0, 'N');
        Robot r=new Robot(c);
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noSeCreaElRobotEnUnaCoordenadaValida(){
        Coordenada c= new Coordenada(0, -1, 'S');
        Robot r=new Robot(c);
    }
    
    @Test
    public void seMueveElRobot(){
        Coordenada nueva= new Coordenada(0, 0, 'N');
        Robot r=new Robot(nueva);
        r.ejecutar('A');
        nueva=r.getCoordenada();
        Coordenada esperada= new Coordenada(0, 1, 'N');
        Assert.assertEquals(nueva.getX()+nueva.getY(),nueva.getOrientacion(), esperada.getX()+esperada.getY()+esperada.getOrientacion());
    }
}
