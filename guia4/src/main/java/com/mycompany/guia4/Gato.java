package com.mycompany.guia4;

public class Gato extends Animal{
    
    private String tipoAlimento;

    public Gato( String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        
    }
    
    public void alimentarse(){
        
        this.tipoAlimento = this.alimento;
        System.out.println(" El tipo de alimento consumido por el gato es "+this.tipoAlimento);
    }
}
