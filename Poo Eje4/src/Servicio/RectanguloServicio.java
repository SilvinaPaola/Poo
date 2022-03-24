/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


/**
 *
 * @author Silvina Paola
 * 
 * 
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    Rectangulo re = new Rectangulo();
    
    //metodo para crear rectangulo
    public Rectangulo crearRectangulo(){
        System.out.println("Por favor, ingrese el valor de la base del rectangulo");
        re.setBase(leer.nextDouble());
        System.out.println("ahora necesitamos que ingrese el valor de la altura del rectangulo");
        re.setAltura(leer.nextDouble());
        
        return re;
    }
    
    //metodo para calcular superficie
    public void superficie(Rectangulo re){
    double superficie= re.getBase()* re.getAltura();
            
        System.out.println("La superficie del rectangulo es " + superficie);
    }
    
    //metodo para calcular peírmetro
    public void perimetro (Rectangulo re){
    
        double perimet = (re.getBase() + re.getAltura())*2;
        System.out.println("El perimetro del rectangulo es " + perimet);
    }
    
    //metodo para dibujar el rectangulo
    public void ImpresionRec(Rectangulo re){
    
        
        String a = " ";
        String b = "*";
        
        
        for (int i = 0; i < re.getBase(); i++) {
            
           
            System.out.print(b + a); //al parecer ok, no tocar
          
        }
            System.out.println(" "); //no tocar
       //--------------------------------------------------------- 
    
        for (int i = 0; i < re.getAltura()-2; i++) { //asi, perfecta cantidad de asteriscos alto y bajo
            
        
            System.out.print(b);
        for (int j = 0; j < re.getBase()-1; j++) {
            
            System.out.print(a+a );  //al parecer ok, no tocar
         
        }
            System.out.println(b);   //al parecer ok, no tocar
    }
         
        //--------------------------------------------------------
         for (int i = 0; i < re.getBase(); i++) {
            
           
            System.out.print(b+a); // no tocar por el momento
          
        }
          
    }
}
