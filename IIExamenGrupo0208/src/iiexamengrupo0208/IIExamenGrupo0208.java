/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0208;

import Caso1_Factory.Arma;
import Caso1_Factory.ArmaFactory;
import Caso1_Factory.Raza;

/**
 *
 * @author gerald
 */
public class IIExamenGrupo0208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         *
         * Prueba Caso 1 Factory
         * 
         */
        
        //Prueba de uso del patrón Factory
        ArmaFactory armaFactory = new ArmaFactory();
               
        Arma  arma = armaFactory.getArma(Raza.Elfos);
        System.out.println(arma.toString());
        
        arma = armaFactory.getArma(Raza.Maiars);
        System.out.println(arma.toString());
    }
    
}
