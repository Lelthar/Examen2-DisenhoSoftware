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
public class OrcosArma extends Arma{
    
    public OrcosArma() {
        super(Material.Hierro, Tipo.Garrote);
    }
    
    public OrcosArma(Material material, Tipo tipo) {
        super(material, tipo);
    }
    
    @Override
    public String toString() {
        return "Orcos arma " + super.toString() + "\n" ;
    }
    
}
