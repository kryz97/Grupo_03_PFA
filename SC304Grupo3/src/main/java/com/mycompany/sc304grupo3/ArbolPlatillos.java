/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
public class ArbolPlatillos {
private NodoArbolPlatillo raiz;

    public ArbolPlatillos() {
        this.raiz = null;
    }

    public void insertarPlatillo(Ingredientes platillo) {
        raiz = insertarRecursivo(raiz, platillo);
    }

    private NodoArbolPlatillo insertarRecursivo(NodoArbolPlatillo nodo, Ingredientes platillo) {
        if (nodo == null) {
            return new NodoArbolPlatillo(platillo);
        }

        if (platillo.getTipoComida().compareTo(nodo.getPlatillo().getTipoComida()) < 0) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), platillo));
        } else if (platillo.getTipoComida().compareTo(nodo.getPlatillo().getTipoComida()) > 0) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), platillo));
        }

        return nodo;
    }

    public void imprimirPorTipoComida(String tipoComida) {
        System.out.println("Platillos de tipo " + tipoComida + ":");
        imprimirRecursivoPorTipoComida(raiz, tipoComida);
    }

    private void imprimirRecursivoPorTipoComida(NodoArbolPlatillo nodo, String tipoComida) {
        if (nodo != null) {
            imprimirRecursivoPorTipoComida(nodo.getIzquierdo(), tipoComida);

            if (nodo.getPlatillo().getTipoComida().equals(tipoComida)) {
                System.out.println(nodo.getPlatillo().getNombre());
            }

            imprimirRecursivoPorTipoComida(nodo.getDerecho(), tipoComida);
        }
    }
}
