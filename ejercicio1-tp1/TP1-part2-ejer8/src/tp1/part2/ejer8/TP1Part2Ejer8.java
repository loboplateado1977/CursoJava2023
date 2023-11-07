/*
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Calculo:
 */
package tp1.part2.ejer8;

public class TP1Part2Ejer8 {

    public static void main(String[] args) {
        // TODO code application logic here
       //a) Informar por consola si un número escogido por usted es primo o no
       System.out.println("********************************");
       System.out.println(" El numero ingresado es primo??"+ Calculo.esPrimo(7));
       System.out.println("********************************");    
       //b) Mostrar por consola el valor absoluto del valor -90;
      // System.out.println(" El valor ingresado "+ Calculo.valorAbsoluto(-8));
       System.out.println("=================================");  
       //c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
        System.out.println(" Ecuacion de segundo grado "+Calculo.calcularRices(4, 0, -1));
        
    }
    
}
