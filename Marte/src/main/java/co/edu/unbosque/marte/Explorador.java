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
        LeerArchivo ltest= new LeerArchivo("C:/Users/Fabian/Desktop/entradas.txt");
        //ltest.AbrirArchivo();
        System.out.println(ltest.entradas.get(0));
        //ltest.LeerArchivo();
        ltest.cerrarArchivo();
        //Coordenada coordInicialR1 = new Coordenada(ltest.entradas[1].substring(), , orientacion)
    }
    
}
