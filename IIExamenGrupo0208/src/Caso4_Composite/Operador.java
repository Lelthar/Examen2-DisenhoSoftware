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
public class Operador implements iSimbolo{
    private String simbolo;
    private iSimbolo ladoIzquierdo;
    private iSimbolo ladoDerecho;

    public Operador(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return this.simbolo;
    }
    public String obtenerExpresion(){
        String resultado;
        
        if (ladoIzquierdo != null && ladoDerecho != null) {
            resultado = "(" + ladoIzquierdo.obtenerExpresion() +" "+this.simbolo+" "+ladoDerecho.obtenerExpresion() + ")";
            return resultado;
        } else {
            return "";
        }
    }
    public void agregarLadoIzq(iSimbolo ladoIzq){
        this.ladoIzquierdo = ladoIzq;
    }
    public void agregarLadoDer(iSimbolo ladoDer){
        this.ladoDerecho = ladoDer;
    }
    public boolean validarExpresion(){
        boolean resultado = this.simbolo.equals(Simbolos.MAS.toString()) || this.simbolo.equals(Simbolos.MENOS.toString()) || this.simbolo.equals(Simbolos.MULTIPLICACION.toString()) || this.simbolo.equals(Simbolos.DIVISION.toString());
        return resultado && this.ladoIzquierdo.validarExpresion() && this.ladoDerecho.validarExpresion();
    }
    public iSimbolo getLadoIzq(){
        return this.ladoIzquierdo;
    }
    public iSimbolo getLadoDer(){
        return this.ladoDerecho;
    }
    
    public int obtenerResultadoExpresion(){
        int resultado;
        if (ladoIzquierdo != null && ladoDerecho != null) {
            if (this.simbolo.equals(Simbolos.MAS.toString())) {
                resultado = ladoIzquierdo.obtenerResultadoExpresion() + ladoDerecho.obtenerResultadoExpresion();
                return resultado;
            } else if (this.simbolo.equals(Simbolos.MENOS.toString())) {
                resultado = ladoIzquierdo.obtenerResultadoExpresion() - ladoDerecho.obtenerResultadoExpresion();
                return resultado;
            } else if (this.simbolo.equals(Simbolos.MULTIPLICACION.toString())) {
                resultado = ladoIzquierdo.obtenerResultadoExpresion() * ladoDerecho.obtenerResultadoExpresion();
                return resultado;
            } else if (this.simbolo.equals(Simbolos.DIVISION.toString())) {
                resultado = ladoIzquierdo.obtenerResultadoExpresion() / ladoDerecho.obtenerResultadoExpresion();
                return resultado;
            } else {
                return 0;
            }
            
        } else {
            return 0;
        }
    }
}
