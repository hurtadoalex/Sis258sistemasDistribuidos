/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retencionesjudiciales;

import java.io.Serializable;

/**
 *
 * @author Alex
 */
class Cuenta implements Serializable {
    private String banco;
    private String NroCuenta;
    private String CI;
    private String Nombres;
    private String Apellidos;
    private double saldo;   
    
    
    public Cuenta(String banco,String NroCuenta, String CI, String Nombres,String Apellido,double saldo) {
        this.banco=banco;
        this.NroCuenta=NroCuenta;
        this.CI=CI;
        this.Nombres=Nombres;
        this.Apellidos=Apellido;
        this.saldo=saldo;
    }

    Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
