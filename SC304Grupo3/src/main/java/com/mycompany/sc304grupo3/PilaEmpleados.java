/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class PilaEmpleados {
        private NodoPila cima;

    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    public PilaEmpleados() {
        this.cima = null;
    }

    public boolean esVacia() {
        return cima == null;
    }

    public void apilar() {
        Empleado empleado = new Empleado();

        empleado.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID del empleado:")));
        empleado.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del empleado:"));
        empleado.setPuesto(JOptionPane.showInputDialog(null, "Digite el puesto del empleado:"));

        NodoPila nuevo = new NodoPila();
        nuevo.setElemento(empleado);

        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "El empleado fue retirado de la pila.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden retirar empleados de una pila vacía.");
        }
    }

    public String imprimirPila() {
        String respuesta = "";

        if (!esVacia()) {
            NodoPila temp = cima;
            while (temp != null) {
                respuesta += "ID: " + temp.getElemento().getID() + "\n";
                respuesta += "Nombre: " + temp.getElemento().getNombre() + "\n";
                respuesta += "Puesto: " + temp.getElemento().getPuesto() + "\n";
                respuesta += "\n";
                temp = temp.getSiguiente();
            }
        } else {
            respuesta = "La pila de empleados está vacía.";
        }

        return respuesta;
    }
}
