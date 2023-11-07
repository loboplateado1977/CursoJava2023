/*
2) En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un constructor que
permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes métodos adicionales:
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
*/
package tp1.parte2.ejer2;

/**
 *
 * @author loren
 */
public class Cuadrilatero {
    private int largo;
    private int alto;

    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int calPerimetro(){
 // calcularPerimetro(): este método retornará el perímetro del cuadrilátero. 
     return((largo*2)+(alto*2));
    }
    
    public int calArea(){
 // calcularArea(): este método retornará la superficie del cuadrilátero.
    return (largo*alto);
    }
    
    public boolean esUnCuadrado(){
 // esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso contrario retornará false.   
        if(alto==largo){
            return true;
        }else{
            return false;
        }
    }
}
