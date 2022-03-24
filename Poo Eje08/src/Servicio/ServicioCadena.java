/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Mauro
 * 
 * • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class ServicioCadena {
    
    public Cadena Ca= new Cadena();
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena ingresarFrase(){
        System.out.println("Ingrese la frase");
        Ca.setFrase(leer.next());
        
        Ca.setLongitud(Ca.getFrase().length());
        
        return Ca;
}

//    public void  mostrarVocales(){
//    
//        char[] caracter= Ca.getFrase().toCharArray();
////        int contador=0;
//        
////        for (int i = 1; i < Ca.getLongitud(); i++) {
////            
//////            if (caracter.equals("a")||caracter.equals("A")||caracter.equals("e")||caracter.equals("E")||caracter.equals("i")||caracter.equals("I")||caracter.equals("O")||caracter.equals("O")||caracter.equals("u")||caracter.equals("U")) {
//////                contador= contador +1;
//////            }
////            System.out.println("La frase tiene "+ contador+" vocales");
////        }
//            
//    }
    
//    public void invertirFrase(char [] caracter){
//        for (int i = 0; i < Ca.getLongitud(); i--) {
//            
//            System.out.println(caracter);
//        }
//    }
    
// • Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(){
    
        System.out.println("Ingrese el caracter que desea buscar");    
       char caracter = leer.next().charAt(0);
       
       int veces=0;
           // Ca.getFrase().indexOf(caracter);
           
           for (int i = 0; i < Ca.getLongitud(); i++) {
               
               if (Ca.getFrase().charAt(i)==caracter) {
                   veces=veces+1;
               }
            
        }
           System.out.println("El caracter aparece "+ veces+ " veces");
    }
    
    
}
