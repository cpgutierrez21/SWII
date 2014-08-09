/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.io.IOException;

/**
 *
 * @author F211
 */
public class Explorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LeerArchivo ltest= new LeerArchivo("C:\\entradas.txt");
        ltest.AbrirArchivo();        
        ltest.LeerArchivo();
        ltest.cerrarArchivo();
        
        Marte marte = new Marte(Integer.valueOf(ltest.entradas.get(0).substring(0,1)),Integer.valueOf(ltest.entradas.get(0).substring(1,2)));
        Coordenada coordInicialR1 = new Coordenada(Integer.valueOf(ltest.entradas.get(1).substring(0, 1)),Integer.valueOf(ltest.entradas.get(1).substring(1, 2)), ltest.entradas.get(1).charAt(2));
        Movimiento movR1 = new Movimiento(ltest.entradas.get(2));
        Robot r1 =  new Robot(coordInicialR1);
        
        int i=0;       
        while (i<= movR1.mov.length-1){
        r1.ejecutar(movR1.getNextMov());}
        r1.getCoordenada();
    }
    
}
