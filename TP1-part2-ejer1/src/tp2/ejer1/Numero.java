package tp2.ejer1;
 /**1) En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un constructor
  * que permita inicializar dicho atributo, los métodos getter y setter y los siguientes métodos adicionales:
*/
public class Numero {

        private int num;
    
    public Numero(int num){
    
        this.num = num;       
    }

    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }
   
    public boolean esPar(){
 /* esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario retornará false.

 */    
        if(num % 2 == 0){
            
               return true;
               
        }else{
                return false;
        }
    
    }
 
    public boolean esPositivo(){
       /*
     esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual a cero, caso 
* contrario retornará false.
    */
        if(num > 0 ){
            
                return true;
            
        }else{
                return false;
        }
    }
    
    public boolean esMultipolo( int num2){
 /*   
     esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor guardado en el 
* atributo es múltiplo del valor recibido, caso contrario retornará false.
*/
        if(num % num2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

