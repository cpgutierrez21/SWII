/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.Movimiento;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestMovimiento {
    @Test
    public void seCreaLaClaseMovimiento(){
        Movimiento m=new Movimiento("IAAADIAD");
    }
    
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void seEsperaLaExcepcionPorCadenaVacia(){
        Movimiento m=new Movimiento("");
    }
    
    @Test
    public void traeElSiguienteMovimiento(){
        Movimiento m=new Movimiento("IAAADIAD");
        char mov=m.getNextMov();
        Assert.assertEquals(mov, 'I');
    }
}
