
package tp1.parte2.ejer2;
/*
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrar por consola su superficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiar el estado de uno de sus atributos para que sea un cuadrado
*/
public class TP1Parte2Ejer2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrilatero cua = new Cuadrilatero(50,70);
        System.out.println(cua.calPerimetro());
        System.out.println(cua.calArea());
        System.out.println(cua.esUnCuadrado());
    }
    
}
