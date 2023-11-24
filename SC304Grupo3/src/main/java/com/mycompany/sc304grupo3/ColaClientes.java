/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author karen
 */
class ColaClientes  {
   private NodoCliente Frente;
   private NodoCliente Ultimo;

    public NodoCliente getFrente() {
        return Frente;
    }

    public void setFrente(NodoCliente Frente) {
        this.Frente = Frente;
    }

    public NodoCliente getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoCliente Ultimo) {
        this.Ultimo = Ultimo;
    }
   
   public void Fila (NodoCliente elemento){
       
       if (Frente == null){
           Frente=elemento;
           Ultimo=elemento;
       }
       else{
           Ultimo.setAtras(elemento);
           Ultimo=elemento;
       }
   }
   
   public NodoCliente Atender (){
       NodoCliente Actual = Frente;
   
       if (Frente != null){
           Frente = Frente.getAtras();
           Actual.setAtras(null);
       
       }
       return Actual;
   }
   
   public String imprimir(){
       String respuesta = " ";
       NodoCliente Actual = Frente;
       
       while(Actual != null){
           respuesta += Actual.getDato() + " - ";
           Actual = Actual.getAtras();
       }
       
       return respuesta;

   }
   
}
