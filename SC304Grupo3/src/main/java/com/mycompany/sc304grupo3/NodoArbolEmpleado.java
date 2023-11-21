/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
public class NodoArbolEmpleado {
     private Empleado empleado;
    private NodoArbolEmpleado izquierdo;
    private NodoArbolEmpleado derecho;

    public NodoArbolEmpleado(Empleado empleado) {
        this.empleado = empleado;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public NodoArbolEmpleado getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbolEmpleado izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbolEmpleado getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbolEmpleado derecho) {
        this.derecho = derecho;
    }
}
