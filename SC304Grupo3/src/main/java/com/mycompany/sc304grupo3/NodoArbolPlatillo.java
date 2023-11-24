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
    private Ingredientes  platillo;
    private NodoArbolPlatillo hijoIzq;
    private NodoArbolPlatillo hijoDer;

    public NodoArbolPlatillo(Ingredientes platillo) {
        this.platillo = platillo;
    }

    public Ingredientes getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Ingredientes platillo) {
        this.platillo = platillo;
    }

    public NodoArbolPlatillo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbolPlatillo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbolPlatillo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbolPlatillo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
}

