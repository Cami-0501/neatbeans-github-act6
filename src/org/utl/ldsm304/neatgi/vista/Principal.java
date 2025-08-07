/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.neatgi.vista;

import java.util.Scanner;
import org.utl.ldsm304.neatgi.controlador.Ejercicio1;
import org.utl.ldsm304.neatgi.controlador.Ejercicio2;
import org.utl.ldsm304.neatgi.modelo.Matriz;

/**
 *
 * @author camie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MostrarMenu();
    }
    
    public static void MostrarMenu(){
        Scanner sc= new Scanner(System.in);
        Ejercicio2 e2 = new Ejercicio2();
        Ejercicio1 e1 = new Ejercicio1();
        Matriz m = new Matriz();
        System.out.println("------MENU------");
        System.out.println("1-Análisis de Precios en Matriz");
        System.out.println("2-Análisis de Cadenas en Matriz");
        
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("------MENU------");
                System.out.println("1-Obtener el número que más se repite.");
                System.out.println("2-Obtener la cantidad de números pares."); 
                System.out.println("3-Obtener la cantidad de números impares");
                System.out.println("4-Obtener la suma de los números que están en la diagonal."); 
                System.out.println("5-Obtener la cantidad de números múltiplos de 5.");
                option=sc.nextInt();
                switch(option){
                    case 1:
                        e1.obtenerNumeroMasRepetido();
                    case 2:
                        e1.obtenerCantidadPares();
                    case 3:
                        e1.obtenerCantidadImpares();
                    case 4:
                        e1.sumarDiagonal(m.getDatos());
                    case 5:    
                        e1.contarMultiplosDeCinco(m.getDatos());
                    break;
            default:
                System.out.println("Error");
                }
            case 2:
                System.out.println("------MENU------");
                System.out.println("1-Devuelva las cadenas que comienzan con la letra “o”");
                System.out.println("2-Devuelva la cadena que tenga las 5 vocales. "); 
                System.out.println("3-Devuelva las cadenas que tienen la silaba “sa”");
                option=sc.nextInt();
                switch(option){
                    case 1:
                        e2.devuelverCadenasEpiezanO(m.Frutas);
                        break;
                    case 2:
                        e2.devolverCadena5Vocales(m.Frutas);
                        break;
                    case 3:
                        e2.mostrarSilaba(m.Frutas);
                    break;
            default:
                System.out.println("Error");
                }
                break;
            default:
                System.out.println("Error");
        }
    }
    
}
