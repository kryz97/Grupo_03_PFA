/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */


public class NodoCircular {

    NodoCircular siguiente;
    Ingredientes dato;

    public NodoCircular(Ingredientes dato) {
        this.dato = dato;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

    public Ingredientes getDato() {
        return dato;
    }

    public void setDato(Ingredientes dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return this.dato.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
