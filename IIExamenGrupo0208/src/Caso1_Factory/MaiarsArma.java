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
public class MaiarsArma extends Arma{
    
    public MaiarsArma() {
        super(Material.Madera, Tipo.Baston);
    }
    
    public MaiarsArma(Material material, Tipo tipo) {
        super(material, tipo);
    }
    
    @Override
    public String toString() {
        return "Maiars arma " + super.toString();
    }
    
}
