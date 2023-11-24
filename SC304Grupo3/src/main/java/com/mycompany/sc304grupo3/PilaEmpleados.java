/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class PilaEmpleados {

    private NodoPila cabeza;

    public void insertar(Empleado p) {
        if (cabeza == null) {
            cabeza = new NodoPila(p);
        } else {
            if (p.getID() < cabeza.getDato().getID()) {
                NodoPila auxiliar = new NodoPila(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            } else {
                if (cabeza.getSiguiente() == null) {
                    cabeza.setSiguiente(new NodoPila(p));
                } else {
                    NodoPila auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getID() < p.getID()) {

                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoPila nuevo = new NodoPila(p);
                    nuevo.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(nuevo);
                }
            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "";
        NodoPila auxiliar = cabeza;
        while (auxiliar != null) {
            respuesta += auxiliar.toString() + " ";
            auxiliar = auxiliar.getSiguiente();
        }
        return respuesta;
    }
}
