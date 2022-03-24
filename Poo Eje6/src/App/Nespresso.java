/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Silvina Paola
 * 
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        Cafetera Ca = new Cafetera();
        CafeteraServicio Nesso = new CafeteraServicio();
        
       int selec =0;
        while (selec !=5 ) {            
  
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Llenar la cafetera");
            System.out.println("2.Servir una taza");
            System.out.println("3.Vaciar la cafetera");
            System.out.println("4.Agregar café la cafetera");
            System.out.println("5.Terminar la accion");
            selec = leer.nextInt();
            
            switch(selec){
                
                case 1:
                    Nesso.llenaCafetera();break;
                   
                case 2:
                    Nesso.servirTaza();break;
                case 3:
                    Nesso.vaciarCafetera();break;
                case 4:
                    Nesso.agregarCafe();break;
                default:
                    System.out.println("Esa opcion no esta disponible");break;
            }
            
        }
        System.out.println("Hasta el proximo cafecito!");
    }
    
}
