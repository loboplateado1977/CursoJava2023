
package tp1.part2.eje4;

/**
4) En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos estáticos:
 convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
 convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Conversor.
a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido
 */
public class Conversor {
    private  double dolar;
    private  double pesos;

    public Conversor(double dolar, double pesos) {
        this.dolar = dolar;
        this.pesos = pesos;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }  
    
    private void convertirAPesos(){
    
        return ();
        
    }
    private static void convertirADolar(){
        
        return();
    }
}
