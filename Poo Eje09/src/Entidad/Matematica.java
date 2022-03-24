/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Mauro
 * 
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Matematica {
    
    private int num1, num2, mayor,menor, potencia, raizCuadrada;

    public Matematica() {
    }

    public Matematica(int num1, int num2, int mayor, int menor, int potencia, int raizCuadrada) {
        this.num1 = num1;
        this.num2 = num2;
        this.mayor = mayor;
        this.menor = menor;
        this.potencia = potencia;
        this.raizCuadrada = raizCuadrada;
    }
    

//   
    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    


    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getRaizCuadrada() {
        return raizCuadrada;
    }

    public void setRaizCuadrada(int raizCuadrada) {
        this.raizCuadrada = raizCuadrada;
    }
    
       public void devolverMayor(int num1, int num2){
    
        if (getNum1()<getNum2()) {
            setMayor(getNum2());
            setMenor(getNum1());
        } else {
            
            setMayor(getNum1());
            setMenor(getNum2());
        }
           System.out.println("El mayor es el numero"+getMayor()+" y el menor es el numero "+getMenor());
    } 

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + ", mayor=" + mayor + ", menor=" + menor + ", potencia=" + potencia + ", raizCuadrada=" + raizCuadrada + '}';
    }

   



   
    
    
    
}
