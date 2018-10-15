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
public enum Simbolos {
    
    MAS("+"),
    MENOS("-"),
    MULTIPLICACION("*"),
    DIVISION("/");
    
   private String value;
   private Simbolos(String value) {
      this.value = value;
   }

   public String toString() {
      return this.value;
   }
}
