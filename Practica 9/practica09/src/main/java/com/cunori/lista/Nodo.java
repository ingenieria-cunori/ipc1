/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.lista;

/**
 *
 * @author hendrick
 */
public class Nodo {
    // atributo para almacenar el número
    private int valor;
    // atributo para enlazar los nodos
    private Nodo siguiente;

    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

    public Nodo(int v) {
        this.valor = v;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }            
    
    
}
