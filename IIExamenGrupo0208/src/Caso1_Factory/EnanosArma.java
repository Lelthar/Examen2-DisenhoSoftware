/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Factory;

/**
 *
 * @author gerald
 */
public class EnanosArma extends Arma{
    
    public EnanosArma() {
        super(Material.Acero, Tipo.Hacha);
    }
    
    public EnanosArma(Material material, Tipo tipo) {
        super(material, tipo);
    }
    
    @Override
    public String toString() {
        return "Enanos arma " + super.toString() ;
    }
}
