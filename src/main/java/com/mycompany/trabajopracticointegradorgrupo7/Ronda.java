/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

/**
 *
 * @author david
 */
public class Ronda {
private int NroRonda;
private int GolesE1;
private int GolesE2;

    public Ronda(int NroRonda, int GolesE1, int GolesE2) {
        this.NroRonda = NroRonda;
        this.GolesE1 = GolesE1;
        this.GolesE2 = GolesE2;
    }

    @Override
    public String toString() {
        return "Ronda{" + "NroRonda=" + NroRonda + ", GolesE1=" + GolesE1 + ", GolesE2=" + GolesE2 + '}';
    }

    public int getNroRonda() {
        return NroRonda;
    }

    public void setNroRonda(int NroRonda) {
        this.NroRonda = NroRonda;
    }

    public int getGolesE1() {
        return GolesE1;
    }

    public void setGolesE1(int GolesE1) {
        this.GolesE1 = GolesE1;
    }

    public int getGolesE2() {
        return GolesE2;
    }

    public void setGolesE2(int GolesE2) {
        this.GolesE2 = GolesE2;
    }


}
