/*
3) En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que 
es una constante con el valor 3.14 y radio; un constructor que permita inicializar el
radio del círculo; los métodos “get” y “set” para radio y los siguientes métodos adicionales:

 */
package tp1.part2.ejer3;

public class Circulo {
    private static double PI=3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circulo.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){          
/*
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del círculo.  
 */
    return(PI*radio*radio);

}
    public double calcularPerimetro(){
        return(2*PI*radio);
    }
}