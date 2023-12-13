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
 ejecutor running = new ejecutor ();
    int start=0;

    public void play() {

        while (start != 8) {
            JOptionPane.showConfirmDialog(null, "Opcion 1: Ver a los empleados\nOpcion 2: Ver Menu de Platillos\n"+
            "Opcion 3: Ver los clientes en cola\nOpcion 4: Ver las ordenes pendietes\nOpcion 5: Ver Menu por categoria\n"+
                    "Opcion 6: Ver los empleados por puesto\nOpcion 7: Ver Balance\nOpcion 8: Salir");
            start = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion que desea ver"));
            switch (start) {
                case 1:
                    running.empleados();
                    break;
                case 2:
                    running.Platillos();
                    break;
                case 3:
                    running.Clientes();
                    break;
                case 4:
                    running.ManejoOrdenes();
                    break;
                case 5:
                    running.PlatilloArbol();
                    break;
                case 6:
                    running.EmpleadoArbol();
                    break;
                case 7:
                     running.BalanceGrafo();
                    break;
                case 8:
                    break;
            }
        }
    }
}
