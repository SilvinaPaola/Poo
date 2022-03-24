/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Mauro
 */
public class MatematicaServicio {
//    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     Matematica nume= new Matematica();
     
     //metodo 1
     public void devolverMayor(){
     int NumMayor=0;
     
         if (nume.getNum1()<nume.getNum2()) {
             NumMayor= nume.getNum2();
         } else {
             NumMayor=nume.getNum1();
             
         }
         
         System.out.println("El numero 1 es "+nume.getNum1()+ " y el numero dos es "+nume.getNum2()+"Le numero mas grande es "+ NumMayor);
     }
   
}
