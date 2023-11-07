/*
En un nuevo proyecto, crear una clase de nombre Triangulo con los atributos: lado1, lado2, lado3; un constructor 
que permita inicializar sus atributos; los métodos getter y setter; y los siguientes métodos adicionales:

 */
package tp1.part2.ejer6;

public class Triangulo {
     private int lado1;
     private int lado2;
     private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
  /*
     esUnTriangulo(): Sabiendo que la regla principal que da origen al triángulo tiene que ver con la longitud 
de sus lados. Esta plantea que la suma de dos de sus lados debe ser mayor a la longitud del tercer lado. 
Por lo tanto si los valores de los lados de este triángulo cumplen con la regla este método retornará 
true caso contrario false.*/     
    
    public boolean esUnTriangulo(){
  
        if ( lado1<=(lado2+lado3)||  lado2 <= (lado1+lado3)|| lado3<=(lado1+lado2)){
                
            return(true);
            
        }else{
            
            return(false);   
        }     
    }
 /*
     tipoTriangulo(): Si es un triángulo y tiene sus tres lados iguales, este método retornará equilátero; 
                       si sus tres lados son distintos, retornará “escaleno”; caso contrario, es decir, 
                        si sólo dos de sus lados son iguales, retornará “isósceles”;
    en el caso de que no sea un triángulo, retornará “Con sus lados no se puede representar un triángulo!!!”
*/
    public  boolean tipoTriangulo(){
       
       boolean esTri =esUnTriangulo();
        
        if ( esTri== true){
            
            System.out.println(" Es un triangulo  ");
        
                if( lado1==lado2 && lado2 == lado3 && lado3==lado1){
            
                    System.out.println(" El triangulo es Equilatero ");
            
                } else if ( lado1!=lado2 && lado2 != lado3 && lado3!=lado1) {
            
                    System.out.println(" EL triangulo es Escaleno ");
                }else {
            
                    System.out.println(" El triangulo es Izoceles");
                }
                return(esTri);
        } else{
                    System.out.println(" No es un triangulo");  
              }  
        return(esTri); 
    }
}

