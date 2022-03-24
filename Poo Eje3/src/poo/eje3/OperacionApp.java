/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.eje3;

import Entidades.Operacion;
import Servicio.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Mauro
 */
public class OperacionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        OperacionServicio opse = new OperacionServicio();
        
        Operacion op = opse.crearOperacion();
        
        opse.sumar(op);
        opse.restar(op);
        opse.multiplicar(op);
        opse.dividir(op);
        
  
    }
    
}
