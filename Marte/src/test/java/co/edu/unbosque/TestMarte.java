/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.Marte;
import org.testng.annotations.Test;


/**
 *
 * @author Fabian
 */
public class TestMarte {
    
   @Test
   public void seCreaMarte(){
       Marte m=new Marte(5,5);
   }
   
   @Test (expectedExceptions = {IllegalArgumentException.class})
   public void noSeCreaMarte(){
       Marte m=new Marte(5,-5);
   }        
}

