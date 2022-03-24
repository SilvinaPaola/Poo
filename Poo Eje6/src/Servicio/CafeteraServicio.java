/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
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
public class CafeteraServicio {
    
    Scanner leer=new Scanner(System.in);
    Cafetera Ca= new Cafetera();
    
    public void llenaCafetera(){
        
    Ca.setCapacidadMaxima(1200); 
    Ca.setCantidadActual(Ca.getCapacidadMaxima());
        System.out.println("La cafetera esta llena");
    }
    
    public void servirTaza(){
    int Taza=275;
    
        if ((Ca.getCantidadActual()>Taza) || (Ca.getCantidadActual()==Taza)) {
            Ca.setCantidadActual(Ca.getCantidadActual()-Taza);
            System.out.println("Aquí tiene su taza servida!");
        } else {
            System.out.println("Lo sentimos, no hemos podido completar la taza, se requiere cargar como minimo" + (Taza-Ca.getCantidadActual()) + "ml para recargar nuevamente la cafetera");
            System.out.println("La taza se lleno " +  Ca.getCantidadActual() + "ml");
        }
    
    }
    public void vaciarCafetera(){
    Ca.setCantidadActual(0);
        System.out.println("Listo, la cafetera esta vacía");
    }
    
    public void agregarCafe(){
        System.out.println("Cuantos ml de cafe desea ingresar?");
        int Agregar = leer.nextInt();
        
        System.out.println("Listo! actualmente su cafetera dispone de " + (Ca.getCantidadActual()+ Agregar) + "ml");
    }
}
