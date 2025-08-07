/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.neatgi.controlador;

import java.util.Scanner;
import org.utl.ldsm304.neatgi.modelo.Matriz;

/**
 *
 * @author camie
 */
public class Ejercicio2 {
      
    public void imprimirFrutas(){
      Matriz ma=new Matriz();
      String[][] frutas= ma.getFrutas();
      System.out.println("Matriz de Frutas:");
        for (String[] fila : frutas) {
            for (String fruta : fila) {
                System.out.print(fruta + "\t");
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
             for (int i = 0; i < Frutas.length; i++) {
        for (int j = 0; j < Frutas[i].length; j++) {
            String cadena = Frutas[i][j];
            int contador = 0;

          
            for (int k = 0; k < cadena.length(); k++) {
                char c = Character.toLowerCase(cadena.charAt(k));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contador++;
                }
            }

            // Imprimir si tiene exactamente 5 vocales
            if (contador == 5) {
                System.out.println("Cadena con 5 vocales: " + cadena);
            }
        }
    }
}
      public void mostrarSilaba(String[][]Frutas){
          System.out.println("\nCadenas que contienen la sílaba 'sa' o 'Sa':");
    for (String[] fila : Frutas) {
        for (String cadena : fila) {
            boolean encontrado = false;
            if (cadena != null && !cadena.isEmpty()) {
                String cadenaLower = cadena.toLowerCase();
                for (int i = 0; i < cadenaLower.length() - 1; i++) {
                    if (cadenaLower.charAt(i) == 's' && cadenaLower.charAt(i + 1) == 'a') {
                        encontrado = true;
                        break;
                    }
                }
            }
            if (encontrado) {
                System.out.println(cadena);
            }
        }
    }
      }
          
      }
