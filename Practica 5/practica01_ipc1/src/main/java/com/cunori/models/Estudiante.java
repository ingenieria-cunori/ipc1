/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class Estudiante {

    //Atributos
    private String universidad;
    private int carne;
    private String nombre;
    private boolean esMasculino;

    //Constructores
    public Estudiante() {
        this.universidad = "CUNORI";
    }

    public Estudiante(int carne, String nombre, boolean esMasculino) {
        this.universidad = "CUNORI";
        this.carne = carne;
        this.nombre = nombre;
        this.esMasculino = esMasculino;
    }

    //Getter | Setter
    public boolean isEsMasculino() {
        return esMasculino;
    }

    public void setEsMasculino(boolean esMasculino) {
        this.esMasculino = esMasculino;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Universidad: " + this.universidad + ", Carné: " + this.carne + ", Nombre: " + this.nombre + ", Género: " + this.esMasculino;
    }

}
