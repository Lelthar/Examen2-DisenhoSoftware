/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_Composite;

/**
 *
 * @author gerald
 */
public class Operando implements iSimbolo{
    
    private String simbolo;

    public Operando(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public String getSimbolo() {
        return this.simbolo;
    }
    
    public String obtenerExpresion() {
        return this.simbolo;
    }
    
    public void agregarLadoIzq(iSimbolo ladoIzq) {
    }
    
    public void agregarLadoDer(iSimbolo ladoDer) {
    }
    public boolean validarExpresion() {
        try {
            Integer.parseInt(this.simbolo);
            return true;
        } catch (NumberFormatException e) {
              return false;
        }
 
    }
    
    public iSimbolo getLadoIzq() {
        return null;
    }
    public iSimbolo getLadoDer() {
        return null;
    }
    
    public int obtenerResultadoExpresion(){
        return Integer.parseInt(this.simbolo);
    }
    
}
