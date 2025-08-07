/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.neatgi.vista;

import java.util.Scanner;
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
        System.out.println("------MENU------");
        System.out.println("1-Análisis de Precios en Matriz");
        System.out.println("2-Análisis de Cadenas en Matriz");
        
        int option=sc.nextInt();
        switch(option){
            case 1:
                e2.equals(e2);
                break;
            case 2:
                System.out.println(e2.getClass());
                break;
            default:
                System.out.println("Error");
        }
    }
    
}
