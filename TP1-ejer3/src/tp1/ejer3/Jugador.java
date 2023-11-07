/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejer3;

/**
 *
 * @author loren
 */
public class Jugador {
    private String nombre;
    private int puntaje;
    private String nacionalidad;
    private int edad;
    
    public Jugador(String nombre, int puntaje, String nacionalidad, int edad){
    
        this.nombre=nombre;
        this.puntaje=puntaje;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
    }
    public Jugador(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void Juego(){
    
        System.out.println("nombre : "+nombre+" puntaje : "+puntaje+" nacionnalidad : "+nacionalidad+" edad: "+edad);
    }
}
