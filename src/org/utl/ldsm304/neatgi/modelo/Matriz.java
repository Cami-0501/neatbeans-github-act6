/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.neatgi.modelo;

/**
 *
 * @author camie
 */
public class Matriz {
     private int[][] datos = {
        {50, 120, 50, 80},
        {75, 100, 120, 90},
        {50, 65, 75, 120},
        {80, 100, 80, 50}
    };

    public int[][] getDatos() {
        return datos;
    }
    
    public String[][] Frutas = {
        {"Mango", "Sandía", "Pera"},
        {"Fresa", "Uva", "Kiwi"},
        {"Aguacate", "Plátano", "Oliva"}
    };

    public String[][] getFrutas() {
        return Frutas;
    }
}
