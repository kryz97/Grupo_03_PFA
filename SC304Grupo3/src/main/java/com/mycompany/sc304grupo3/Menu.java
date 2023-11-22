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
    private ColaClientes colaClientes;
    private ListaDoble listaOrdenes;

    public Menu() {
        pilaEmpleados = new PilaEmpleados();
        listaCircular = new ListaCircular();
        colaClientes = new ColaClientes();
        listaOrdenes = new ListaDoble();
    }

    public void iniciar() {
        boolean ejecutar = true;
        while (ejecutar) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de opciones:\n" +
                            "Escriba el numero correspondiente:\n"
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
                    ImprimirEmpleados();
                    ImprimirPlatillos();
                    break;

                case "4":
                    ManejoDeOrdenes();
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    ejecutar = false;
                    System.out.println("Se ha terminado el programa");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Introduce una opción válida (1-5).");
            }
        }
    }

    public void ManejoDeOrdenes() {
        if (!colaClientes.estaVacia()) {
            Cliente cliente = colaClientes.atenderCliente();
            JOptionPane.showMessageDialog(null, "Atendiendo cliente: " + cliente.getNombre());

            // Se Procesa el cliente aquí

            JOptionPane.showMessageDialog(null, "Procesado cliente: " + cliente.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes en la cola.");
        }
    }

    public void ImprimirEmpleados() {
        String empleados = "Empleados en la pila:\n";
        empleados += pilaEmpleados.imprimirRecursivo(pilaEmpleados.getCima());
        JOptionPane.showMessageDialog(null, empleados);
    }

    public void ImprimirPlatillos() {
        String platillos = "Platillos en la lista:\n";
        platillos += listaCircular.imprimirRecursivo(listaCircular.cabeza, listaCircular.ultimo);
        JOptionPane.showMessageDialog(null, platillos);
    }
}
