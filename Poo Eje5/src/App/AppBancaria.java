/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidad.Bancaria;
import Servicio.ServicioBancaria;
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
public class AppBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("bienvenido a Bancaria");
        Bancaria Ba = new Bancaria();
        ServicioBancaria Sb = new ServicioBancaria();
        
        Sb.crearCuenta();
        Sb.identificador();
     
        // menu
         int opcion = 1;
         while (opcion != 6) { 
         
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extraccion rapida de dinero");
        System.out.println("4. Consulta saldo");
        System.out.println("5. Consulta datos");
        System.out.println("6. Salir");
     
        
          
         opcion = leer.nextInt();
              switch (opcion){
            
            case 1:
                Sb.ingresar();break;
            case 2:
                Sb.retirar();break;
            case 3:
                Sb.extraccionRapida();break;
            case 4:
                Sb.consultarSaldo();break;
            case 5:
                Sb.consultarDatos();break;
            case 6:
                System.out.println("Muchas gracias");
                break;
              
                
            default:
                System.out.println("esa opcion no esta diponible");
         
        }
            
        } //while ();
    }
    
    
}
