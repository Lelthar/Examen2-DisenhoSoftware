package Caso1_Factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerald
 */
public class ArmaFactory {
    
    
    // implementacion de metodo que devuelve una instancia de un helado usando OCP
    // que depende de la ubicación de los objetos que se desean crear.
    public Arma getArma(Raza raza){
        Arma arma;
        try {
            //recupera el paquete donde se encuentra la clase base
            String paquete = Arma.class.getPackage().getName();
            
            String laInstancia = paquete+"."+raza.name()+"Arma";
             
            arma = (Arma) Class.forName(laInstancia).newInstance();
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
           arma = null;
        }
        return arma;
    }
}
