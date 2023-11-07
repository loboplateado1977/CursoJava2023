/*
8) En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Calculo:

 */
package tp1.part2.ejer8;

import static java.lang.Math.sqrt;

public class Calculo {
   
    private int num;

    public Calculo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
/*
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es primo, 
caso contrario retornará false.   
*/
   
    public static boolean esPrimo(int num){
        int cont=2;
        while( num % cont!=0 && cont == num-1){      
            cont++;     
        }
        return( num % cont!=0 );
    }
    /*
     valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
    */
    public static int valorAbsoluto(int num){
        
        if (num < 0 ){
            int valor =num*(-1);
            
            System.out.println(" El valor absoluto del numero ingresado es "+valor);
        }  
        return(num);
}
     /*
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo grado 
y mostrará por consola sus raíces y si no las tiene también lo informará.
    */
    
    public static float calcularRices(float a,float b,float c){
        
        float r1=0;
        float r2=0;
        
        if (a==0){
            r1=0;
            r2=0;
            System.out.println(" No es una ecuacion de segundo grado ");
            System.out.println(" raiz r1 = "+r1);
            System.out.println(" raiz r2 = "+r2);   
        }else{
                if( b==0 &&((-4*a*c)/(2*a)>=1)){
                    r1=(float) -sqrt((-4*a*c)/(2*a)) ;
                    r2= (float) sqrt((-4*a*c)/2*a) ;    
                    System.out.println(" raiz r1 = "+r1);
                    System.out.println(" raiz r2 = "+r2);
                }else{
                    System.out.println(" La raiz es imaginaria");
                }
            } 
         return();
        }
}    


