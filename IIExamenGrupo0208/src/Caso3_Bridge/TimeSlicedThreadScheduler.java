/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Bridge;

/**
 *
 * @author Rigo-PC
 */
public class TimeSlicedThreadScheduler implements iThreadScheduler{
    
    @Override
    public void ejecutar(){
        System.out.println(" bajo el esquema: TimeSlicedThreadScheduler");
    }
}
