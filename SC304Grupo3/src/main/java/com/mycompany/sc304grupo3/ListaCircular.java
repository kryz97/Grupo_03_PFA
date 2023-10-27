/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;
/**
 *
 * @author chris
 */
public class ListaCircular {
    NodoCircular cabeza;
    NodoCircular ultimo;

    public void inserta(Ingredientes p) {
        if (cabeza == null) {
            cabeza = new NodoCircular(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        } else {
            if (p.getId() < cabeza.getDato().getId()) {
                // Insertamos al inicio
                NodoCircular auxiliar = new NodoCircular(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            } else {
                if (ultimo.getDato().getId() < p.getId()) {
                    // Insertamos al final
                    NodoCircular auxiliar = new NodoCircular(p);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                } else {
                    // Insertamos en el medio de la lista
                    NodoCircular auxiliar = cabeza;
                    while (auxiliar.getSiguiente().getDato().getId() < p.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }

                    NodoCircular temporal = new NodoCircular(p);
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
    }

    public String imprimirSiguienteDelUltimo() {
        return ultimo.getSiguiente().toString();
    }

    @Override
    public String toString() {
        String respuesta = "Lista circular: \n";

        NodoCircular auxiliar = cabeza;

        if (auxiliar != null) {
            // Para determinar que no está vacía
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while (auxiliar != cabeza) {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }

}
