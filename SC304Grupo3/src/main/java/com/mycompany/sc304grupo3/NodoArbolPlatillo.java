/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
public class NodoArbolPlatillo {
    private Ingredientes platillo;
    private NodoArbolPlatillo izquierdo;
    private NodoArbolPlatillo derecho;

    public NodoArbolPlatillo(Ingredientes platillo) {
        this.platillo = platillo;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Ingredientes getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Ingredientes platillo) {
        this.platillo = platillo;
    }

    public NodoArbolPlatillo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbolPlatillo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbolPlatillo getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbolPlatillo derecho) {
        this.derecho = derecho;
    }

    public String getTipoComida() {
        return platillo.getTipoComida();
    }
}

