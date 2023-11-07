/*Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en
pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda
que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.*/
 
package com.mycompany.guia4;

public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean sintonizador;
    int resolucion;
    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, float precio, String color, char letra, float peso) {
        super(precio, color, letra, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
/*• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el
televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un
sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en
la clase Electrodomestico también deben afectar al precio.*/

     public void precioFinalT(){
         if (pulgadas >40 ){
             this.precio= this.precio+(this.precio*0.3f);
         }
        
    }
}
