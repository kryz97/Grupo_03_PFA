/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class ejecutor {

    
    //Pila de empleados
    public void empleados() {
        PilaEmpleados Empleados = new PilaEmpleados();

        Empleados.insertar(new Empleado(109, "López", "Chef Estrella"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(105, "Pablo Martínez", "Mesero"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(103, "Ana Rodríguez", "Bartender"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(107, "Juan García", "Bartender"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(104, "Marta Sánchez", "Cocinero"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(101, "Carlos Pérez", "Cocinero"));
        System.out.println(Empleados.toString());

        Empleados.insertar(new Empleado(108, "Laura Gómez", "Mesero"));
        System.out.println(Empleados.toString());
    }

    //Lista circular de Platillos
    public void Platillos() {
        ListaCircular listaPlatillos = new ListaCircular();

        listaPlatillos.inserta(new Ingredientes(203 , "Lomo Saltado","Almuerzo", 15.50, 20.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(207 , "Risotto de Mariscos","Cena", 18.75, 25.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(204 , "Tacos Al Pastor","Almuerzo", 8.50, 12.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(205 , "Sopa de Cebolla","Cena", 6.25, 10.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(201 , "Filete Mignon","Cena", 22.00, 30.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(206 , "Paella Valenciana","Almuerzo", 20.75, 28.00));
        System.out.println(listaPlatillos.toString());
        
        listaPlatillos.inserta(new Ingredientes(202 , "Ensalada Caprese","Desayuno", 7.00, 11.00));
        System.out.println(listaPlatillos.toString());
    }
    
    //Cola de clientes
    public void Clientes(){
    
        ColaClientes fila = new ColaClientes();
        
        fila.Fila(new NodoCliente("Juan"));
        fila.Fila(new NodoCliente("María"));
        fila.Fila(new NodoCliente("Pedro"));
        fila.Fila(new NodoCliente("Sofía"));
        fila.Fila(new NodoCliente("Roberto"));
        fila.Fila(new NodoCliente("Carlos"));
        fila.Fila(new NodoCliente("Christopher"));
        fila.Fila(new NodoCliente("Luis"));
        System.out.println(fila.imprimir());
        //Turno de Juan
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Maria
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Pedro
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Sofia
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Roberto
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Carlos
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Christopher
        fila.Atender();
        System.out.println(fila.imprimir());
        //Turno de Luis
        fila.Atender();
        System.out.println(fila.imprimir()); 
    }
    
    public void ManejoOrdenes(){
        ListaDoble Ordenes = new ListaDoble();
        
        Ordenes.inserta(new Orden(304,"Sofía","Ensalada Caprese",11.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(303,"Pedro","Paella Valenciana",28.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(306,"Carlos","Filete Mignon",30.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(307,"Christopher","Sopa de Cebolla",10.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(305,"Roberto","Tacos Al Pastor",12.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(308,"Luis","Risotto de Mariscos",25.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(301,"Juan","Lomo Saltado",20.00));
        System.out.println(Ordenes.toString());
        Ordenes.inserta(new Orden(302,"María","Paella Valenciana",28.00));
        System.out.println(Ordenes.toString());
        
    }
    
    public void PlatilloArbol(){
        
        ArbolPlatillos PlatilloCategoria = new ArbolPlatillos();
        
        //menu
        PlatilloCategoria.inserta(new Ingredientes(203 , "Lomo Saltado","Almuerzo", 15.50, 20.00));
        PlatilloCategoria.inserta(new Ingredientes(207 , "Risotto de Mariscos","Cena", 18.75, 25.00));
        PlatilloCategoria.inserta(new Ingredientes(204 , "Tacos Al Pastor","Almuerzo", 8.50, 12.00));
        PlatilloCategoria.inserta(new Ingredientes(205 , "Sopa de Cebolla","Cena", 6.25, 10.00));
        PlatilloCategoria.inserta(new Ingredientes(201 , "Filete Mignon","Cena", 22.00, 30.00));
        PlatilloCategoria.inserta(new Ingredientes(206 , "Paella Valenciana","Almuerzo", 20.75, 28.00));
        PlatilloCategoria.inserta(new Ingredientes(202 , "Ensalada Caprese","Desayuno", 7.00, 11.00));
        
        //imprimir por categorias
        PlatilloCategoria.imprimirPorTipoComida("Desayuno");
        PlatilloCategoria.imprimirPorTipoComida("Almuerzo");
        PlatilloCategoria.imprimirPorTipoComida("Cena");
    }
    
    public void EmpleadoArbol(){
    ArbolEmpleados arbolEmpleados = new ArbolEmpleados();

    // Agregar empleados al árbol
    arbolEmpleados.insertarEmpleado(new Empleado(109, "López", "Chef Estrella"));
    arbolEmpleados.insertarEmpleado(new Empleado(105, "Pablo Martínez", "Mesero"));
    arbolEmpleados.insertarEmpleado(new Empleado(103, "Ana Rodríguez", "Bartender"));
    arbolEmpleados.insertarEmpleado(new Empleado(107, "Juan García", "Bartender"));
    arbolEmpleados.insertarEmpleado(new Empleado(104, "Marta Sánchez", "Cocinero"));
    arbolEmpleados.insertarEmpleado(new Empleado(101, "Carlos Pérez", "Cocinero"));
    arbolEmpleados.insertarEmpleado(new Empleado(108, "Laura Gómez", "Mesero"));

    arbolEmpleados.imprimirPorPuesto("Chef Estrella");
    arbolEmpleados.imprimirPorPuesto("Cocinero");
    arbolEmpleados.imprimirPorPuesto("Bartender");
    arbolEmpleados.imprimirPorPuesto("Mesero");
    
    }
}
