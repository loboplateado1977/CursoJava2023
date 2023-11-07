package com.mycompany.guia4;

public class Caballo extends Animal {
    private String tipoAlimento;

    public Caballo( String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        
    }
    
    public void alimentarse(){
        
        this.tipoAlimento = this.alimento;
        System.out.println(" El tipo de alimento consumido por el caballo es  "+this.tipoAlimento);
    }
    
}
