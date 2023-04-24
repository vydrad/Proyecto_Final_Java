/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */
public class Personas {
    private String Nombre;
    private int PuntotTot;

    public Personas(String Nombre, int PuntotTot) {
        this.Nombre = Nombre;
        this.PuntotTot = PuntotTot;
    }

    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntotTot() {
        return PuntotTot;
    }

    public void setPuntotTot(int PuntotTot) {
        this.PuntotTot = PuntotTot;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", PuntotTot=" + PuntotTot + '}';
    }
    
    
    
}
