/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.retencionesjudiciales;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class Juez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    try {
        ListaCuentas LP;
        LP=(ListaCuentas)Naming.lookup("rmi://localhost/LP"); // instanciar un objeto remoto 
        
        Cuenta[] Cuenta = new Cuenta[10];
        String[] banco = {"BNB", "Banco Mercantil", "Banco BCP"};
        String[] NroCuenta = {"12-456789", "65-321457", "98-654467"};
        String[] CI={"123456","456789","987654"};
        String[] Nombres={"Alex john","Alex john","Alex john"};
        String[] Apellidos={"Hurtado Flores","Hurtado Flores","hurtado Flores"};
        double[] saldo={10006449,496465,56891665};
        Cuenta Cuen= LP.ConsultarCuentas(banco,NroCuenta,CI, Nombres, Apellidos,saldo);
        
        

        for (int i = 0; i < 3; i++) {
            System.out.println( Cuenta[i].getBanco());
        System.out.println( Cuenta[i].getNroCuenta());
        System.out.println( Cuenta[i].getCI());
        System.out.println( Cuenta[i].getNombres());
        System.out.println( Cuenta[i].getApellidos());
        System.out.println( Cuenta[i].getSaldo());
        }
        
        
    } catch (NotBoundException ex) {
        Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
    } catch (RemoteException ex) {
        Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
}
