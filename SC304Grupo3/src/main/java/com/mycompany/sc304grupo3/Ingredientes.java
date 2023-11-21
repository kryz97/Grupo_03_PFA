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
public class Ingredientes {
    private int ID;
    private String nombre;
    private double costo;
    private double precio;
    private String tipoComida;

    public Ingredientes() {
        
    }

    public Ingredientes(int ID, String nombre, double costo, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
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
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void solicitarDatos() {
        // Utilizamos JOptionPane para solicitar los datos al usuario
        this.ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del platillo:"));
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del platillo:");
        this.costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del platillo:"));
        this.precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del platillo:"));
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nNombre: " + nombre + "\nCosto: $" + costo + "\nPrecio: $" + precio;
    }
}
