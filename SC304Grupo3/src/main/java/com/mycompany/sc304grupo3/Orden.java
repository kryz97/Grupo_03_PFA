/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class Orden {
    private int id;
    private String nombreCliente;
    private String platillo;
    private double monto;

    public Orden(int id, String nombreCliente, String platillo, double monto) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.platillo = platillo;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {

        this.monto = monto;
    }



    @Override
    public String toString() {
        monto = monto+(monto*0.10);
        return id + " - " + nombreCliente + " - " + platillo + " - $" + monto;
    }
}
