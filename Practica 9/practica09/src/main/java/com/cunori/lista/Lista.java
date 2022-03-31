/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.lista;

/**
 *
 * @author hendrick
 */
public class Lista {

    private Nodo inicio;
    private int tamanio;

    public Lista() {
        this.inicio = null;
        this.tamanio = 0;
    }

    /**
     * Devuelve si la lista esta vacia
     *
     * @return true si la lista está vacia
     */
    public boolean esVacia() {
        return this.inicio == null;
    }

    /**
     * Devuelve el tamaño de la lista
     *
     * @return número entero entre [0,n]
     */
    public int getTamanio() {
        return this.tamanio;
    }

    /**
     * Agrega un nodo al inicio de la lista
     *
     * @param valor Tipo de datos Entero
     */
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            this.inicio = nuevo;
        }
        this.tamanio++;
    }
    
    
     /**
     * Agrega un nodo al final de la lista
     *
     * @param valor Tipo de datos Entero
     */
    public void insertarAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        if(esVacia()){
            this.inicio = nuevo;
        }else{
            Nodo aux = inicio;
            while (aux.getSiguiente()!=null) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.tamanio++;
    }    

    public void listar() {
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            System.out.println("\nNodos:");
            while (aux != null) {
                System.out.print(i + ".[" + aux.getValor() + "]" + "-> ");     
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println("NULL\n");
        }else{
            System.out.println("\nLa lista está vacia\n");
        }
    }

}
