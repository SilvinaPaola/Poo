/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Mauro
 * 
 * 
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
* 
* 
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
* 
* 
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
public class ServicioPersona {
    //importar lo necesario
    Scanner leer= new Scanner(System.in);
    Persona Pe= new Persona();
    
    //metodo para crear persona
    public Persona crearPersona(){
    System.out.println("Ingrese su nombre");
    Pe.setNombre(leer.next());
    System.out.println("Ingrese su edad");
    Pe.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: H(hombre), M(mujer), O(otro)");
    Pe.setSexo(leer.next());
    
        if (Pe.getSexo().equalsIgnoreCase("h")|| Pe.getSexo().equalsIgnoreCase("m")||Pe.getSexo().equalsIgnoreCase("o")) {
            System.out.println("Su sexo a sido registrado con exito");
        } else {
            System.out.println("No hemos podido identificar su seleccion, por favor ingrese correctamnete su sexo");
        }
    return Pe;
    }
    
    //metodo para calcular imc
    public double calcularImc(){
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        System.out.println("Ingrese su peso");
        double peso =leer.nextDouble();
        
        double formula = peso/(altura*altura);
        double imc = formula*10000;
        
        System.out.println("Su indice de masa corporal es "+imc);
        
        if (imc<21) {
            System.out.println("El valor de la funcion es -1, usted se encuentra por debajo de su peso ideal");
        } else {
            if (imc >20 && imc<26) {
                System.out.println("El valor de la funcion es 0, usted se encuentra en su peso ideal");    
            } else {
                if (imc>25) {
                    System.out.println("El valor de la funcion es 1, usted se encuentra sobre su peso ideal");
                    
                }
            }
        }
     return imc;
    }
    //metodo para detectar si es mayor de edad
    
    public boolean seMayordeEdad(){
     
    boolean mayorEd= Pe.getEdad() >17;
    
        System.out.println("Esta persona es mayor de edad: " + mayorEd);  
        
        return mayorEd;
    }
}
