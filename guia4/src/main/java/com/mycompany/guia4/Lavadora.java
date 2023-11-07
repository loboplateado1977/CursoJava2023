/*
Para crear una subclase, se incluye la palabra clave extends en la declaración de la clase.
class nombreSubclase extends nombreSuperclase{
A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
 */
package com.mycompany.guia4;


public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, float precio, String color, char letra, float peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    //-----------------------------------------------------------------------
 /* Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
al precio.*/
    
    public void precioFinalL(){
        this.precioFinal();
    }
   
    
}
