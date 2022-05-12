/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.retencionesjudiciales;

import java.rmi.RemoteException;

/**
 *
 * @author Alex
 */
public interface ListaCuentas {
    Cuenta ConsultarCuentas (String CI,String Nombres,String Apellidos) throws RemoteException;
    Congelar RetenerMonto (String cuenta,int monto,String glosa);

    public Cuenta ConsultarCuentas(String[] banco, String[] NroCuenta, String[] CI, String[] Nombres, String[] Apellidos, double[] saldo);
}
