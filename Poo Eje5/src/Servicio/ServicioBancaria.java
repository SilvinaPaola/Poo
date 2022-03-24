/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Bancaria;
import java.util.Scanner;

/**
 *
 * @author Silvina Paola
 * 
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 
 */
public class ServicioBancaria {
    Scanner leer= new Scanner(System.in);
    Bancaria Ba = new Bancaria();
    
    //crear cuenta bancaria
    
    public Bancaria crearCuenta(){
        System.out.println("Bienvenido al Banco Bancaria");
        System.out.println("Por favor, ingrese su DNI");
        Ba.setDni(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta");
        Ba.setNumDcuenta(leer.nextLong());
        
       
        return Ba;
    
    }
    
    //metodo identificador
    public void identificador(){
     if (Ba.getDni()== 31844502) {
            System.out.println("Hola, Silvina!");
            
            System.out.println("Su saldo actual es " + Ba.getSaldo());
        } else {
            String respuesta;
            
            System.out.println("Hola! eres nuevo?");
            respuesta=leer.next();
            
            if (respuesta.equals("SI")||respuesta.equals("Si")||respuesta.equals("si")) {
                System.out.println("Por favor ingrese su nombre");
                String nombre=leer.next();
                System.out.println(nombre + ", el saldo actual es " + Ba.getSaldo());
            } else {
                System.out.println("Ok, su saldo actual es " + Ba.getSaldo());
            }
            
        }}
    
    //metodo para ingresar dinero a la cuenta
    
    public void ingresar(){
        System.out.println("Indique el valor que desea ingresar a su cuenta");
        double Ingreso=leer.nextDouble();
        
        Ba.setSaldo(Ba.getSaldo()+Ingreso);
        
        System.out.println("Su saldo actual es de " + Ba.getSaldo());
    }
    
    //metodo para retirar dinero de la cuenta
    public void retirar(){
        System.out.println("Indique el valor que desea retirar a su cuenta");
        double Retiro=leer.nextDouble();
        
          Ba.setSaldo(Ba.getSaldo()-Retiro);
        
        System.out.println("Su saldo actual es de " + Ba.getSaldo());
}
    //metodo para extraccion rapida
    public void extraccionRapida(){
    
        System.out.println("Cuanto dinero desea extraer?");
        double Extrae = leer.nextDouble();
        double Permitido= Ba.getSaldo()*0.20;
        
        if (Extrae<Permitido || Extrae== Permitido) {
            
            Ba.setSaldo(Ba.getSaldo()-Extrae);
            System.out.println("La operacion se realizo con exito. su saldo ahora es de " + Ba.getSaldo());
            
        } else {
            System.out.println("No es posible extraer el monto solicitado");
        }
    }
    
    //metodo para consultar saldo
    public void consultarSaldo(){
        System.out.println("Su saldo es de " + Ba.getSaldo());
    
    }
    
    //metodos para consultar datos
    public void consultarDatos(){
    
        System.out.println("Los datos de su cuenta son: " + Ba);
            
            }
    
    
}