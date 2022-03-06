/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.models;

/**
 *
 * @author hendrick
 */
public class CuentaMonetaria {

    private int numero;
    private String tipo;
    private String cuentaHabiente;
    private float saldo;

    public CuentaMonetaria() {
        this.saldo = 500.00f;
    }

    public CuentaMonetaria(int numero, String tipo, String cuentaHabiente) {
        this.numero = numero;
        this.tipo = tipo;
        this.cuentaHabiente = cuentaHabiente;
        this.saldo = 500.00f;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCuentaHabiente() {
        return cuentaHabiente;
    }

    public void setCuentaHabiente(String cuentaHabiente) {
        this.cuentaHabiente = cuentaHabiente;
    }

    public float getSaldo() {
        return saldo;
    }

    /**
     * Este método permite incrementar el saldo del cuenta habiente
     *
     * @param monto
     */
    public void depositar(float monto) {
        this.saldo += monto;
    }

    /**
     * Este método permite decrementar el saldo del cuenta habiente
     *
     * @param monto
     */
    public void retirar(float monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("El monto a retirar supera el saldo actual");
        }
    }

}
