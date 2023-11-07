
package ejemplo.pkgdo.pkgwhile;

public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int pasos = 0;
        do{
            System.out.println("valor "+pasos);
            pasos++;
    }while (pasos < 5);
        
        System.out.println("Fin");
    }
    
}
