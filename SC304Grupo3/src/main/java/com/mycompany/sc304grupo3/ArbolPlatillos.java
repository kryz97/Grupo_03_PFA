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

    public void inserta(Ingredientes platillo) {
        if (raiz == null) {
            raiz = new NodoArbolPlatillo(platillo);
        } else {
            insertaRecursivo(raiz, platillo);
        }
    }

    private void insertaRecursivo(NodoArbolPlatillo nodo, Ingredientes platillo) {
        if (platillo.getTipoComida().compareTo(nodo.getPlatillo().getTipoComida()) <= 0) {
            if (nodo.getHijoIzq() == null) {
                nodo.setHijoIzq(new NodoArbolPlatillo(platillo));
            } else {
                insertaRecursivo(nodo.getHijoIzq(), platillo);
            }
        } else {
            if (nodo.getHijoDer() == null) {
                nodo.setHijoDer(new NodoArbolPlatillo(platillo));
            } else {
                insertaRecursivo(nodo.getHijoDer(), platillo);
            }
        }
    }

    public void imprimirPorTipoComida(String tipoComida) {
        System.out.println("Platillos de tipo " + tipoComida + ":");
        imprimirRecursivoPorTipoComida(raiz, tipoComida);
    }

    private void imprimirRecursivoPorTipoComida(NodoArbolPlatillo nodo, String tipoComida) {
        if (nodo != null) {
            imprimirRecursivoPorTipoComida(nodo.getHijoIzq(), tipoComida);

            if (nodo.getPlatillo().getTipoComida() != null && nodo.getPlatillo().getTipoComida().equals(tipoComida)) {
                System.out.println(nodo.getPlatillo());
            }

            imprimirRecursivoPorTipoComida(nodo.getHijoDer(), tipoComida);
        }
    }
    
}
