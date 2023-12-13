/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc304grupo3;

/**
 *
 * @author chris
 */
public class BalanceGrafo {
    private NodoGrafo[] nodos;
    private double[][] matrizAdyacencia;

    public BalanceGrafo(int cantidadNodos) {
        nodos = new NodoGrafo[cantidadNodos];
        matrizAdyacencia = new double[cantidadNodos][cantidadNodos];

        for (int i = 0; i < cantidadNodos; i++) {
            nodos[i] = new NodoGrafo(i);
        }
    }

    public void agregarArista(int nodoOrigen, int nodoDestino, double balance) {
        matrizAdyacencia[nodoOrigen][nodoDestino] = balance;
    }

    public void imprimirMatrizAdyacencia() {
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    // RECORRIDO POR AMPLITUD
    public NodoGrafo[] recorridoAmplitud(int nodoInicial) {
        NodoGrafo[] nodosVisitados = new NodoGrafo[nodos.length];
        boolean[] visitado = new boolean[nodos.length];
        int frente = 0;
        int finalCola = 0;
        int[] cola = new int[nodos.length];

        visitado[nodoInicial] = true;
        cola[finalCola++] = nodoInicial;

        while (frente != finalCola) {
            int nodoPorAtender = cola[frente++];
            nodosVisitados[frente - 1] = nodos[nodoPorAtender];

            for (int i = 0; i < nodos.length; i++) {
                if (matrizAdyacencia[nodoPorAtender][i] != 0 && !visitado[i]) {
                    visitado[i] = true;
                    cola[finalCola++] = i;
                }
            }
        }

        System.out.println("Nodos visitados a amplitud: ");

        for (int i = 0; i < nodosVisitados.length; i++) {
            System.out.println(nodosVisitados[i].getValor());
        }

        return nodosVisitados;
    }
        // MÉTODO PARA CALCULAR GANANCIAS DIARIAS
    public void balanceDiario() {
        double gananciasDiarias = 0;

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                gananciasDiarias += matrizAdyacencia[i][j];
            }
        }

        System.out.println("Ganancias diarias: $" + Math.abs(gananciasDiarias));
    }
}
