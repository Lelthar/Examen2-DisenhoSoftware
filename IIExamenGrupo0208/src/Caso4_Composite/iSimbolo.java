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
public interface iSimbolo {
    
    public String getSimbolo();
    public String obtenerExpresion();
    public void agregarLadoIzq(iSimbolo ladoIzq);
    public void agregarLadoDer(iSimbolo ladoDer);
    public boolean validarExpresion();
    public iSimbolo getLadoIzq();
    public iSimbolo getLadoDer();
    public int obtenerResultadoExpresion();
}
