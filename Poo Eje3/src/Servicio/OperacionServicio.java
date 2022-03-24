/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Mauro
 * 
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
public class OperacionServicio {
    
    Operacion op = new Operacion();
    Scanner leer = new Scanner(System.in);
    
    // metodo para cargar atributos del objeto
    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer numero");
      op.setNum1(leer.nextInt());
        
      System.out.println("Ingrese el segundo numero");
      op.setNum2(leer.nextInt());
      
      return op;
    }
    
    //metodo para sumar numeros
    public void sumar(Operacion op){
    int suma = op.getNum1()+op.getNum2();
        System.out.println("Los dos numeros suman " + suma);
    
    }
    //metodo para restarlos
    public void restar(Operacion op){
    int resta = op.getNum1()-op.getNum2();
        System.out.println("La resta de ambos numero es " + resta);
    }
    
    //metodo para multiplicar
    public void multiplicar(Operacion op){
    
        if (op.getNum1()== 0 || op.getNum2() == 0) {
            
            double multiplica = 0;
             System.out.println("Ha ocurrido un error, el resultado es " + multiplica);
        } else {
            double multiplica = op.getNum1()*op.getNum2();
            System.out.println("El numero " + op.getNum1() + " multiplicado por el numero " + op.getNum2() + " da como resultado = " + multiplica);
        }
    }
    
    //metodo para dividir
    public void dividir(Operacion op){
    
         if (op.getNum1()== 0 || op.getNum2() == 0) {
            
            double divide = 0;
             System.out.println("Ha ocurrido un error, el resultado es " + divide);
        } else {
            double divide = op.getNum1()/op.getNum2();
             System.out.println("El numero " + op.getNum1() + " dividido por el numero " + op.getNum2() + " da como resultado = " + divide);
        }
    }
}
