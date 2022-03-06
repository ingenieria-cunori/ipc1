/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cunori.main;

import com.cunori.models.Estudiante;
import com.cunori.models.CuentaMonetaria;

/**
 *
 * @author hendrick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando un objeto        
        Estudiante eduardo = new Estudiante();
        eduardo.setCarne(202032698);
        eduardo.setNombre("Eduardo Cruz");
        eduardo.setEsMasculino(true);

        System.out.println("Valores del primer Objeto");
        System.out.println(eduardo.getCarne());
        System.out.println(eduardo.getNombre());
        System.out.println(eduardo.isEsMasculino());
        System.out.println("***************************");

        //Declarado
        Estudiante carlos;
        //Inicializando el objeto
        carlos = new Estudiante(2021326598, "Carlos Méndez", true);
        System.out.println("Valores del segundo Objeto");
        System.out.println(carlos.toString());
        System.out.println("***************************");

        CuentaMonetaria cuenta = new CuentaMonetaria();
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.depositar(500.00f);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(100f);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(1000f);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

}
