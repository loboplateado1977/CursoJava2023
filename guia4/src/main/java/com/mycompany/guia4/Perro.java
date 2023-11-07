package com.mycompany.guia4;

public class Perro extends Animal{
   private String tipoAlimento;

    public Perro( String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }   
   
    public void alimentarse(){
        
        this.tipoAlimento = this.alimento;
        System.out.println(" El tipo de alimento consumido es por el perro  "+this.tipoAlimento);
       
    }
    
}
