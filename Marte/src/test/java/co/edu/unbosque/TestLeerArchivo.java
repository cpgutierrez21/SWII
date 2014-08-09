/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.LeerArchivo;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 *
 * @author Fabian
 */
public class TestLeerArchivo {
    @Test
    public void TestLeerArchivo() throws FileNotFoundException {
        LeerArchivo l = new LeerArchivo("entradas.txt");
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void seEsperaLaExcepcionPorCadenaVacia() throws FileNotFoundException{
        LeerArchivo l=new LeerArchivo("");
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void archivoVacion() throws IOException{
        LeerArchivo l=new LeerArchivo("entradas.txt");
        l.AbrirArchivo();
        l.LeerArchivo();
        int i=l.entradas.size();
        Assert.assertEquals(i, 0);
    }
}
