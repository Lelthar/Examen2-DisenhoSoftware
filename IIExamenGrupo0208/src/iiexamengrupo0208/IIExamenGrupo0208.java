/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0208;

import Caso1_Factory.Arma;
import Caso1_Factory.ArmaFactory;
import Caso1_Factory.Raza;
import Caso3_Bridge.JVM;
import Caso3_Bridge.Linux;
import Caso3_Bridge.PreemptiveThreadScheduler;
import Caso3_Bridge.SistemaOperativo;
import Caso3_Bridge.TimeSlicedThreadScheduler;
import Caso3_Bridge.Windows;
import Caso4_Composite.Operador;
import Caso4_Composite.Operando;
import Caso4_Composite.iSimbolo;

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
        
        ArmaFactory armaFactory = new ArmaFactory();
               
        Arma  arma = armaFactory.getArma(Raza.Elfos);
        System.out.println("Primer ejemplo caso 1:");
        System.out.println(arma.toString());
        System.out.println("");
        
        arma = armaFactory.getArma(Raza.Maiars);
        System.out.println("Segundo ejemplo caso 1:");
        System.out.println(arma.toString());
        
        /**
         *
         * Prueba Caso 3 Bridge
         * 
         */
        
        System.out.println("\nPRUEBA CASO 3 BRIDGE");
        
        SistemaOperativo windowsPTS = new Windows(new PreemptiveThreadScheduler());
        windowsPTS.atenderSolicitud();
        
        SistemaOperativo linuxPTS = new Linux(new PreemptiveThreadScheduler());
        linuxPTS.atenderSolicitud();
        
        SistemaOperativo JVM_PTS = new JVM(new PreemptiveThreadScheduler());
        JVM_PTS.atenderSolicitud();
        
        SistemaOperativo windowsSTS = new Windows(new TimeSlicedThreadScheduler());
        windowsSTS.atenderSolicitud();
        
        SistemaOperativo linuxSTS = new Linux(new TimeSlicedThreadScheduler());
        linuxSTS.atenderSolicitud();
        
        SistemaOperativo jJVM_STS = new JVM(new TimeSlicedThreadScheduler());
        jJVM_STS.atenderSolicitud();
        
        /**
         *
         * Prueba Caso 4 Composite
         * 
         */
        System.out.println("\nPRUEBA CASO 4 COMPOSITE");
        
        iSimbolo operando1 = new Operando("2");
        iSimbolo operando2 = new Operando("3");
        iSimbolo operacion = new Operador("+");
        operacion.agregarLadoIzq(operando1);
        operacion.agregarLadoDer(operando2);
        
        System.out.println("Primer ejemplo caso 4: ");
        System.out.println("Expresion: "+operacion.obtenerExpresion());
        System.out.println("Valido: "+operacion.validarExpresion());
        System.out.println("Resultado: "+operacion.obtenerResultadoExpresion());
        System.out.println("");
        
        iSimbolo operando3 = new Operando("5");
        iSimbolo operando4 = new Operando("3");
        iSimbolo operacion2 = new Operador("*");
        operacion2.agregarLadoIzq(operando3);
        operacion2.agregarLadoDer(operando4);
        
        iSimbolo operacion3 = new Operador("+");
        iSimbolo operando5 = new Operando("6");
        operacion3.agregarLadoIzq(operacion2);
        operacion3.agregarLadoDer(operando5);
        
        iSimbolo operacion4 = new Operador("+");
        iSimbolo operando6 = new Operando("3");
        iSimbolo operando7 = new Operando("4");
        operacion4.agregarLadoIzq(operando6);
        operacion4.agregarLadoDer(operando7);
        
        iSimbolo operacion5 = new Operador("-");
        operacion5.agregarLadoDer(operacion3);
        operacion5.agregarLadoIzq(operacion4);
        
        System.out.println("Segundo ejemplo caso 4: ");
        System.out.println("Expresion: "+operacion5.obtenerExpresion());
        System.out.println("Valido: "+operacion5.validarExpresion());
        System.out.println("Resultado: "+operacion5.obtenerResultadoExpresion());
        
    }
    
}
