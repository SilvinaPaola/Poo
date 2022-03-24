/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.eje09;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Mauro
 * 
 * 
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. 
* 
* En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set.
* 
* Deberá además implementar los siguientes métodos:
* 
* 
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class PooEje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creando objeto
        Matematica num= new Matematica();
        MatematicaServicio Mate=new MatematicaServicio();
       
        
        //generando numeros
    
        num.setNum1((int) (Math.random()*100));
        num.setNum2((int) (Math.random() * 100));
       
        System.out.println("El numero 1 es "+ num.getNum1()+" y el numero 2 es "+num.getNum2());
        
        //metodo 1
       Mate.devolverMayor();
    }
}
    

