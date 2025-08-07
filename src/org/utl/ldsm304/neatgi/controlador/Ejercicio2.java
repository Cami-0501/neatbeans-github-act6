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
        {"Aguacate", "Plátano", "Oliva"}
    };
      
      private void matriz() {
        for (String[] fila : Frutas ) {
            for (String cadena : fila) {
                System.out.print(cadena + "\t");
            }
            System.out.println();
        }
      }
      
      public  void devuelverCadenasEpiezanO(String[][] Frutas){
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
      
      public void devolverCadena5Vocales(String[][]Frutas){
            System.out.println("\nCadenas que tienen las 5 vocales:");
    for (String[] fila : Frutas) {
        for (String cadena : fila) {
            if (cadena != null && !cadena.isEmpty()) {
                boolean tieneA = false;
                boolean tieneE = false;
                boolean tieneI = false;
                boolean tieneO = false;
                boolean tieneU = false;
                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = Character.toLowerCase(cadena.charAt(i));
                    switch (caracter) {
                        case 'a':
                            tieneA = true;
                            break;
                        case 'e':
                            tieneE = true;
                            break;
                        case 'i':
                            tieneI = true;
                            break;
                        case 'o':
                            tieneO = true;
                            break;
                        case 'u':
                            tieneU = true;
                            break;
                    }
                    if (tieneA && tieneE && tieneI && tieneO && tieneU) {
                        break;
                    }
                }
                if (tieneA && tieneE && tieneI && tieneO && tieneU) {
                    System.out.println(cadena);
                }
            }
        }
    }
}
          
      }
