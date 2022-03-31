/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cunori.practica09;

import com.cunori.lista.Lista;

/**
 *
 * @author hendrick
 */
public class Practica09 {

    public static void main(String[] args) {      
        Lista miLista = new Lista();
        miLista.listar();
        miLista.insertarAlInicio(50);
        miLista.listar();
        miLista.insertarAlInicio(100);
        miLista.insertarAlInicio(200);
        miLista.insertarAlInicio(300);
        miLista.listar();
        miLista.insertarAlFinal(60);
        miLista.listar();
        miLista.insertarAlFinal(150);
        miLista.listar();
        System.out.println(miLista.getTamanio());
    }
}
