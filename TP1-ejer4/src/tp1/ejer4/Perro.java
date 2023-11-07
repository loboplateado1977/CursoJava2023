/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejer4;

/**
 *
 * @author loren
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private Double peso;
    private int edad;
    
    public Perro(String nombre,String raza,Double peso,int edad){
    
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.edad=edad;
        
    }
    public Perro(){
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void tipoPerro(){
    
    System.out.println("nombre : "+nombre+" raza : "+raza+" peso : "+peso+"kg"+" edad: "+edad+" año");
    }
}
