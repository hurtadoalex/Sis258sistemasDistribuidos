/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.retencionesjudiciales;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class Asfi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Asfi emisor;
//	    LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
            emisor = new Asfi();
            Naming.bind("banco asfi", (Remote) emisor);
            System.out.println("servidor levantado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        // TODO code application logic here
       /* public Cuenta ConsultarCuentas (String CI,String Nombres,String Apellidos) {
        Cuenta d = new Cuenta();
        boolean sinerrores = true;
        try{
            ListaCuentas LP;
            LP= (ListaCuentas) Naming.lookup("rmi://localhost/Asfi");
            Cuenta respuesta = LP.ConsultarCuentas(CI, Nombres, Apellidos);

            
        }
        /*catch (NotBoundException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
}
