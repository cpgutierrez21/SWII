/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Fabian
 */
public class LeerArchivo {
    FileInputStream fstream;
    DataInputStream distream;
    //FileReader entrada;
    BufferedReader in;
    
    public ArrayList<String> entradas=new ArrayList();
    
    public LeerArchivo(String entradastxt) throws FileNotFoundException {
        if(entradastxt.isEmpty())
            throw new IllegalArgumentException("La ubicación del archivo no puede ser vacía");                
            this.fstream=new FileInputStream(entradastxt);
    }
    public void AbrirArchivo() {
       
            distream = new DataInputStream(fstream);
            in = new BufferedReader(new InputStreamReader(distream));
               
    }
    
    public void LeerArchivo(){
        try{
        String s=in.readLine();
        while ( s!=null) {         	     
	          entradas.add(s);                   
                  s = in.readLine();	            
	         }
        }catch(EOFException endOfFileException){return;}
        catch ( IOException ioException ){System.err.println( "Error al leer del archivo." );}
    }
    
    public void cerrarArchivo()
	   {
        try {
            distream.close();
        } catch (IOException ex) {
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
	   }
}
