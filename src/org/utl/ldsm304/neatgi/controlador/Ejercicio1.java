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
        return impares;
    }
}
