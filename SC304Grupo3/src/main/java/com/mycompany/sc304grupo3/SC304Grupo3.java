/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class SC304Grupo3 {

    public static void main(String[] args) {
        //solicitar informacion al usuario para los platillos
        ListaCircular ListaCircular = new ListaCircular();
        
        Ingredientes Ingredientes1 = new Ingredientes();
        Ingredientes1.solicitarDatos();
        ListaCircular.inserta(Ingredientes1);

        Ingredientes Ingredientes2 = new Ingredientes();
        Ingredientes2.solicitarDatos();
        ListaCircular.inserta(Ingredientes2);
        
        Ingredientes Ingredientes3 = new Ingredientes();
        Ingredientes3.solicitarDatos();
        ListaCircular.inserta(Ingredientes3);
        
        Ingredientes Ingredientes4 = new Ingredientes();
        Ingredientes4.solicitarDatos();
        ListaCircular.inserta(Ingredientes4);
        
        Ingredientes Ingredientes5 = new Ingredientes();
        Ingredientes5.solicitarDatos();
        ListaCircular.inserta(Ingredientes5);

        System.out.println(ListaCircular.toString());
        System.out.println(ListaCircular.imprimirSiguienteDelUltimo());
    }
}

