/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.neatgi.controlador;

import java.util.Scanner;

/**
 *
 * @author camie
 */
public class Ejercicio2 {
      private String[][] Frutas = {
        {"Mango", "Sandía", "Pera"},
        {"Fresa", "Uva", "Kiwi"},
        {"Cereza", "Plátano", "Oliva"}
    };
      
      private void matriz() {
        for (String[] fila : Frutas ) {
            for (String cadena : fila) {
                System.out.print(cadena + "\t");
            }
            System.out.println();
        }
      }
      
      public  void devuelvenCadenasEpiezanO(String[][] Frutas){
         for (String[] fila : Frutas) {
            for (String cadena : fila) {
                if (cadena.length() > 0) {
                    char primeraLetra = cadena.charAt(0);
                    if (primeraLetra == 'o' || primeraLetra == 'O') {
                        System.out.println(cadena);
                    }
                }
            }
        
              
          }
         
         
      
      } 
}