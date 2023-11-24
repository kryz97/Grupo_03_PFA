/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class Empleado {

    private int ID;
    private String nombre;
    private String puesto;

    public Empleado(){}

    public Empleado(int ID, String nombre, String puesto) {
        this.ID = ID;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
        @Override
    public String toString() {
        return this.ID + " - " + this.nombre +" - " + this.puesto;
    }
}
