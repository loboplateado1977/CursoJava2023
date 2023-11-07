
package ejemplo2.prueba;

import ejemplo2.negocio.Persona;

/**import ejemplo2.negocio.Persona; es el paquete que nesecito y siquiero 
 * importar todos solo pongo en ves del nombre del paquete a importar pongo asterisco
 * @author loren
 */

public class Testing {
    public static void main(String arg[]){
        
        /** Instancio objeto persona y lo guardo en una variable 
         */
         Persona juan= new Persona("Juan Lopez",34);
   
         System.out.println("nombre: "+ juan.getNombre());
         System.out.println("edad : "+juan.getEdad());
    }
}
