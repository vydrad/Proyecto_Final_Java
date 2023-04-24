/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */
public class Partido  {
    private Ronda NroRonda;
    private Equipo Equipo1;
    private Equipo Equipo2;
    private int Goles1;
    private int Goles2;

    public Partido(Ronda NroRonda, Equipo Equipo1, Equipo Equipo2, int Goles1, int Goles2) {
        this.NroRonda = NroRonda;
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.Goles1 = Goles1;
        this.Goles2 = Goles2;
    }

    public Ronda getNroRonda() {
        return NroRonda;
    }

    public void setNroRonda(Ronda NroRonda) {
        this.NroRonda = NroRonda;
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

    public int getGoles1() {
        return Goles1;
    }

    public void setGoles1(int Goles1) {
        this.Goles1 = Goles1;
    }

    public int getGoles2() {
        return Goles2;
    }

    public void setGoles2(int Goles2) {
        this.Goles2 = Goles2;
    }

    @Override
    public String toString() {
        return "Partido{" + "NroRonda=" + NroRonda + ", Equipo1=" + Equipo1 + ", Equipo2=" + Equipo2 + ", Goles1=" + Goles1 + ", Goles2=" + Goles2 + '}';
    }

    
    
}
