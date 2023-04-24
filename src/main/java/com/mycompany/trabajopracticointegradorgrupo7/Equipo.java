/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */
public class Equipo {
    private String Nombre;
    private int GolesTotales;
 
    
    
    
    @Override
    public String toString() {
        return "Equipo{" + "Nombre=" + Nombre + ", GolesTotales=" + GolesTotales + '}';
    }

    public Equipo(String Nombre, int GolesTotales) {
        this.Nombre = Nombre;
        this.GolesTotales = GolesTotales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getGolesTotales() {
        return GolesTotales;
    }

    public void setGolesTotales(int GolesTotales) {
        this.GolesTotales = GolesTotales;
    }
    
    
    
}
