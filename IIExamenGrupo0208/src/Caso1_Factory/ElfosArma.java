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
public class ElfosArma extends Arma{
    
    public ElfosArma() {
        super(Material.Oro, Tipo.Daga);
    }
    
    public ElfosArma(Material material, Tipo tipo) {
        super(material, tipo);
    }
    
    @Override
    public String toString() {
        return "Elfos arma " + super.toString();
    }
}
