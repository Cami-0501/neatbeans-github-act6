/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.neatgi.vista;

import java.util.Scanner;
import org.utl.ldsm304.neatgi.controlador.Ejercicio1;
import org.utl.ldsm304.neatgi.controlador.Ejercicio2;

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
                        
                    case 2:
                        
                    case 3:
                    
                    case 4:
                        
                    case 5:    
                        
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
                        
                    case 2:
                        
                    case 3:
                        
                        
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
