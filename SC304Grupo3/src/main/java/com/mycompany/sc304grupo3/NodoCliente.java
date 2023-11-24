/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
class NodoCliente {
    private String Cliente;
    private NodoCliente atras;

    public NodoCliente(String dato) {
        this.Cliente = dato;
    }

    public String getDato() {
        return Cliente;
    }

    public void setDato(String dato) {
        this.Cliente = dato;
    }

    public NodoCliente getAtras() {
        return atras;
    }

    public void setAtras(NodoCliente atras) {
        this.atras = atras;
    }
    
    @Override
    public String toString() {
        return this.Cliente;
    }
    
    
}



