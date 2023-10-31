/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
class ColaClientes  {
    private NodoCliente frente;
    private NodoCliente fin;

    public ColaClientes() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void agregarCliente(Cliente cliente) {
        NodoCliente nuevo = new NodoCliente(cliente);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Cliente atenderCliente() {
        if (!estaVacia()) {
            Cliente cliente = frente.getCliente();
            frente = frente.getSiguiente();
            if (frente == null) {
                fin = null;
            }
            return cliente;
        }
        return null;
    }
}
