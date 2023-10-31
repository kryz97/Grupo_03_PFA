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
public class Menu {
    private PilaEmpleados pilaEmpleados;
    private ListaCircular listaCircular;

    public void iniciar() {
        boolean ejecutar = true;
        while (ejecutar) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de opciones:\n"
                    + "1) Agregar empleados\n"
                    + "2) Agregar platillos\n"
                    + "3) Imprimir Empleados y platillos\n"
                    + "4) Manejo de ordenes\n"
                    + "5) Salir"
            );

            switch (opcion) {
                case "1":
                    pilaEmpleados.apilar();
                    break;

                case "2":
                    Ingredientes ingredientes = new Ingredientes();
                    ingredientes.solicitarDatos();
                    listaCircular.inserta(ingredientes);
                    break;

                case "3":
                    System.out.println("Empleados en la pila (recursivo):");
                    System.out.println(pilaEmpleados.imprimirRecursivo(pilaEmpleados.getCima()));
                    System.out.println("Platillos en la lista circular (recursivo):");
                    System.out.println(listaCircular.imprimirRecursivo(listaCircular.cabeza, listaCircular.ultimo));
                    break;

                case "4":
                    // Manejo de ordenes
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    ejecutar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Introduce una opción válida (1-5).");
            }
        }
    }
}
