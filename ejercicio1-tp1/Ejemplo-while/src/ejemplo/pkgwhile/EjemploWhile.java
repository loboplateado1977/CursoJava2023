
package ejemplo.pkgwhile;

import java.util.Scanner;

public class EjemploWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer =new Scanner(System.in);
        int edad = 0;
        
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        
        while (edad <0){
        
            System.out.println("No es una edad valida");
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
        }
    }
    
}
