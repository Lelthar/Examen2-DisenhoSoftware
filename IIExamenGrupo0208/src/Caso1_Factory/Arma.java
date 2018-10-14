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
public abstract class Arma {
    private Material material;
    private Tipo tipo;
   

    public Arma(Material material, Tipo tipo) {
        this.material = material;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return  "{ Material: " + material + ", Tipo: " + tipo + " }";
    }
}
