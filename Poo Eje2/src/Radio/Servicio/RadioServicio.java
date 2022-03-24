/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Radio.Servicio;



import Entidad.Radio;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Silvina Paola
 */
public class RadioServicio {
    
      Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        
    //solicita radio y guarda en atributo (c) 
    public Radio crearCircunferencia(){
        
        Radio ra = new Radio();
        
        System.out.println("Ingrese el valor de radio");
         ra.setRadio(leer.nextDouble());
       
            return ra;
     
    } 
    //Calcular area (d)
    public void calcularArea(Radio ra){
        
        double area = (ra.getRadio()*ra.getRadio()) * PI; 
        System.out.println("El area de la circunferencia es " + area);
    }
    //calcular perimetro (e)
    public void calcularPerimetro(Radio ra){
        
       double perimetro =  2 * PI * ra.getRadio();
        System.out.println("El perimetro de la circunferencia es " + perimetro);
    }
    
}
