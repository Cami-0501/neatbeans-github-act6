/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.neatgi.controlador;

import org.utl.ldsm304.neatgi.modelo.Matriz;

/**
 *
 * @author camie
 */
public class Ejercicio1 {
    private Matriz modelo;
    
    public Ejercicio1() {
        this.modelo = new Matriz();
    }
    
    public int obtenerNumeroMasRepetido() {
        int[][] precios = modelo.getDatos();
        int[] frecuencias = new int[201];
        int numeroMasRepetido = -1;
        int maximoConteo = 0;

        for (int[] fila : precios) {
            for (int numero : fila) {
                frecuencias[numero]++;
                if (frecuencias[numero] > maximoConteo) {
                    maximoConteo = frecuencias[numero];
                    numeroMasRepetido = numero;
                }
            }
        }
        System.out.println("El numero mas repetido es: "+numeroMasRepetido);
        return numeroMasRepetido;
    }

    public int obtenerCantidadPares() {
        int[][] precios = modelo.getDatos();
        int pares = 0;
        for (int[] fila : precios) {
            for (int numero : fila) {
                if (numero % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println("la cantidad de numeros pares es: "+pares);
        return pares;
    }

    public int obtenerCantidadImpares() {
        int[][] precios = modelo.getDatos();
        int impares = 0;
        for (int[] fila : precios) {
            for (int numero : fila) {
                if (numero % 2 != 0) {
                    impares++;
                }
            }
        }
        System.out.println("La cantidad de numeros impares es: "+impares);
        return impares;
    }
    
    public int sumarDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("Suma de la diagonal: "+suma);
        return suma;
    }
    
    public int contarMultiplosDeCinco(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 5 == 0) {
                    contador++;
                } 
            }
        }
        System.out.println("Cantidad de múltiplos de 5: "+contador);
        return contador;
    }
    
    
}
