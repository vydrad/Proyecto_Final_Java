/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */
public class Pronostico {
    private String Nombre;
    private Equipo Equipo1;
    private Equipo Equipo2;
    private String ganador;

    public Pronostico(String Nombre, Equipo Equipo1, Equipo Equipo2, String ganador) {
        this.Nombre = Nombre;
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.ganador = ganador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Equipo getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(Equipo Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public Equipo getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(Equipo Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "Nombre=" + Nombre + ", Equipo1=" + Equipo1 + ", Equipo2=" + Equipo2 + ", ganador=" + ganador + '}';
    }

    



   
    
    
    
}
