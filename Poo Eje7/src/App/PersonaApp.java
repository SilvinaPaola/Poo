/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidad.Persona;
import Servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Mauro
 * 
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
* 
* 
* 
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
* en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //importar lo que necesito 
       //Scanner leer= new Scanner(System.in);
        
        Persona Pe1 = new Persona(); 
        Persona Pe2 = new Persona();
        Persona Pe3= new Persona();
        Persona Pe4= new Persona();   
        
        ServicioPersona Sepe1 =new ServicioPersona();
        ServicioPersona Sepe2 =new ServicioPersona();
        ServicioPersona Sepe3 =new ServicioPersona();
        ServicioPersona Sepe4 =new ServicioPersona();
        
        
        
        
        Pe1 = Sepe1.crearPersona();  //crear las personas
             double imc1= Sepe1.calcularImc();   //calcular imc
             boolean me1= Sepe1.seMayordeEdad(); //calcular edad      
        Pe2 = Sepe2.crearPersona();
              double imc2=Sepe2.calcularImc();   //calcular imc
               boolean me2=Sepe2.seMayordeEdad(); //calcular edad
        Pe3 = Sepe3.crearPersona();
              double imc3=Sepe3.calcularImc();   //calcular imc
               boolean me3=Sepe3.seMayordeEdad(); //calcular edad
        Pe4 = Sepe4.crearPersona();
              double imc4=Sepe4.calcularImc();   //calcular imc
               boolean me4=Sepe4.seMayordeEdad(); //calcular edad
              
        //calcular porcentaje imc 
        int a = 0;//por debajo del peso
        int b =0;//peso ideal
        int c=0;//sobrepeso
        
        if (imc1<21) {
            a=1;
        } else {
            if (imc1 >20 && imc1<26) {
                b=1;
            } else 
                if (imc1>25) {
                c=1;
            }
            }
        //...............
         if (imc2<21) {
            a= a+1;
        } else {
            if (imc2 >20 && imc2<26) {
                b=b+1;
            } else 
                if (imc2>25) {
                c=c+1;
            }
            }
         
         
          if (imc3<21) {
            a=a+1;
        } else {
            if (imc3 >20 && imc3<26) {
                b=b+1;
            } else 
                if (imc3>25) {
                c=c+1;
            }
            }
          
           if (imc4<21) {
            a=a+1;
        } else {
            if (imc4 >20 && imc4<26) {
                b=b+1;
            } else 
                if (imc4>25) {
                c=c+1;
            }
            }
           //momento de porcentaje
           double pordeba= (a*100)/4;
           double ideal= (b*100)/4;
           double sobrepe= (c*100)/4;
           
           //resolucion
           System.out.println("Del total de persona, el  %" + pordeba+ "se encuentra por debajo de su peso, el %" +ideal+ " se encuentra en su peso ideal, mientras que el %"+sobrepe+"Se encuentra exedido de peso");
        //...............
        int mayed=0;
        int mened=0;
        
        if (me1==false) {
           mened=1; 
            
        } else {
            mayed=1;
        }
        
        if (me2==false) {
           mened=mened+1; 
            
        } else {
            mayed=mayed+1;
        }
        
        if (me3==false) {
           mened=mened+1; 
            
        } else {
            mayed=mayed+1;
        }
        
        if (me4==false) {
           mened=mened+1; 
            
        } else {
            mayed=mayed+1;
        }
        //calculo porcentaje
        mayed=(mayed*100)/4;
        mened=(mened*100)/4;
        
        //resolucion
        
        System.out.println("El %"+mayed+ "de las personas son mayor de edad, mientras que el %" + mened+"son menores");
        //...............
        }
       
        
    }
    

