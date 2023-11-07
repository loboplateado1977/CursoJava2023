package ejemplo1;

/**
 *
 * @author loren
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona perso = new Persona();
         perso.Saludar();
         Persona perso1 = new Persona("cruz","juan",34);
         perso1.Saludar();
    }
}
