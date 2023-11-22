/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class ListaDoble {
    private NodoOrdenes cabeza;
    private NodoOrdenes ultimo;

    public void inserta(Orden orden) {
        if (cabeza == null) {
            cabeza = new NodoOrdenes(orden);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
        } else {
            if (cabeza.getDato().getId() > orden.getId()) {
                NodoOrdenes aux = new NodoOrdenes(orden);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            } else {
                if (orden.getId() > ultimo.getDato().getId()) {
                    NodoOrdenes aux = new NodoOrdenes(orden);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    NodoOrdenes aux = cabeza.getSiguiente();
                    while (aux.getDato().getId() < orden.getId()) {
                        aux = aux.getSiguiente();
                    }

                    NodoOrdenes temp = new NodoOrdenes(orden);
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux);
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "Lista doble circular de órdenes: \n";

        if (cabeza != null) {
            NodoOrdenes aux = cabeza;

            respuesta += aux.toString() + "\n";

            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }
}
