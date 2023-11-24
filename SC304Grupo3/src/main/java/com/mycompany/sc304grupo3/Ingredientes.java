/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;
/**
 *
 * @author chris
 */
public class Ingredientes {
    private int ID;
    private String nombre;
    private String TipoComida;
    private double costo;
    private double precio;
    
    
    public Ingredientes (){
    }

    public Ingredientes(int ID, String nombre, String TipoComida, double costo, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.TipoComida=TipoComida;
        this.costo = costo;
        this.precio = precio;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(String TipoComida) {
        this.TipoComida = TipoComida;
    }
    
    
    
    @Override
    public String toString() {
        return this.ID + " " + this.nombre + " - " +this.TipoComida+ " - $" + this.costo + " - $" + this.precio; 
    }
    
}
