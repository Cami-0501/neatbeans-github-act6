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
