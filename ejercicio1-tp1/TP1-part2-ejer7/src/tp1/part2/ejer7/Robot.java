/*
7) En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería 
inicializado en 500 unidades de energía y nombre; un constructor que permita inicializar 
únicamente a su atributo nombre; los métodos getter y setter para sus atributos y los 
siguientes métodos adicionales:

 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor
menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
8)
*/
package tp1.part2.ejer7;

public class Robot {
    private String nombre;
    private float bateria=500;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
 /*
 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo
que por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería suficiente.
 */   
    
    public float avansar(){
        
        int pasos=0;
        float bateriaF=0;
        if (bateria == 500 && pasos<=5000){
            bateriaF =(float) (bateria - pasos*0.1);
            System.out.println(" La cantidad de bateria consumida es "+bateriaF);
            
        }else if (bateria == 500 && pasos == 5000)
                System.out.println("Se consumioel total de la bateria");
        else{
                System.out.println(" La cantidad de pasos exede la bateria");
}
}
} 

