/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class NodoOrdenes {
        private Orden dato;
    private NodoOrdenes anterior;
    private NodoOrdenes siguiente;

    public NodoOrdenes(Orden dato) {
        this.dato = dato;
    }

    public Orden getDato() {
        return dato;
    }

    public void setDato(Orden dato) {
        this.dato = dato;
    }

    public NodoOrdenes getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoOrdenes anterior) {
        this.anterior = anterior;
    }

    public NodoOrdenes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoOrdenes siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
