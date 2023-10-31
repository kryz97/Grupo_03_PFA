/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class NodoPila {
        private Empleado elemento;
    private NodoPila siguiente;

    public NodoPila() {
        this.siguiente = null;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public Empleado getElemento() {
        return elemento;
    }

    public void setElemento(Empleado elemento) {
        this.elemento = elemento;
    }
}
