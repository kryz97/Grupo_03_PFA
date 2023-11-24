/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
public class ArbolEmpleados {
private NodoArbolEmpleado raiz;

    public ArbolEmpleados() {
        this.raiz = null;
    }

    public void insertarEmpleado(Empleado empleado) {
        raiz = insertarRecursivo(raiz, empleado);
    }

    private NodoArbolEmpleado insertarRecursivo(NodoArbolEmpleado nodo, Empleado empleado) {
        if (nodo == null) {
            return new NodoArbolEmpleado(empleado);
        }

        if (empleado.getPuesto().compareToIgnoreCase(nodo.getEmpleado().getPuesto()) < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), empleado));
        } else if (empleado.getPuesto().compareToIgnoreCase(nodo.getEmpleado().getPuesto()) > 0) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), empleado));
        }

        return nodo;
    }

    public void imprimirPorPuesto(String puesto) {
        System.out.println("Empleados en el puesto " + puesto + ":");
        imprimirRecursivoPorPuesto(raiz, puesto);
    }

    private void imprimirRecursivoPorPuesto(NodoArbolEmpleado nodo, String puesto) {
        if (nodo != null) {
            imprimirRecursivoPorPuesto(nodo.getIzquierdo(), puesto);

            if (nodo.getEmpleado().getPuesto().equalsIgnoreCase(puesto)) {
                System.out.println(nodo.getEmpleado().getNombre());
            }

            imprimirRecursivoPorPuesto(nodo.getDerecho(), puesto);
        }
    }
}

