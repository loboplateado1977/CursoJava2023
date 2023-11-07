/*
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Circulo con radio 5.75 ;
Luego utilizando sus métodos:
b) Mostrar por consola su perímetro
c) Mostrar por consola su superficie.
 */
package tp1.part2.ejer3;


public class TP1Part2Ejer3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir =new Circulo(5.75);
        
        System.out.println(cir.calcularArea());
        System.out.println(cir.calcularPerimetro());
    }
    
}
