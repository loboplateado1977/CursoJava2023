
package tp2.ejer1;

public class TP2Ejer1 {

    public static void main(String[] args) {
        // TODO code application logic here
/*
    Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Numero con el valor 1459
Luego utilizando sus métodos:
b) Mostrar por consola si es par o no.
c) Mostrar por consola si es positivo o no.
d) Mostrar por consola si es múltiplo de 3.
 */
        Numero nro= new Numero(1459);
        System.out.println(nro.esPar());
        System.out.println(nro.esPositivo());
        System.out.println(nro.esMultipolo(3));
        System.out.println("*********************");
        Numero nro1= new Numero(10);
        System.out.println(nro1.esPar());
        System.out.println(nro1.esPositivo());
        System.out.println(nro1.esMultipolo(3));
    }
    
}
