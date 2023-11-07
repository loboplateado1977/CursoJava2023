/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploseleccion;

    public class Seleccion {
    public static void  votar(int edad){
        
        if (edad >=16){
            System.out.println("usted puede votar");
        }else { 
            System.out.println("Usted no puede votar");
        }
        
            System.out.println("Siempre");
    }
    public static void mostrarTriangulo(double lado1,double lado2,double lado3){
    
        if (lado1==lado2 &&lado1==lado3){
        
            System.out.print("Triangulo equilatero ");
            
        }else if (lado1!= lado2 && lado1!= lado3 &&lado2!=lado3){
        
            System.out.print("Triangulo escaleno");
                
        }else{
            System.out.println("Triangulo Isoseles");
                }
        }
    
    public static void mostrarDia( int dia){
    
            switch(dia){
                
                case 1:{System.out.println("Lunes");
                        break;}
                case 2:{System.out.print("Martes");
                        break;}
                case 3:{System.out.println("Miercoles");
                        break;}
                case 4:{System.out.println("Jueves");
                        break;}
                case 5:{System.out.println("Viernes");
                        break;}
                case 6:{System.out.println("Sabado");
                        break;}
                case 7:{System.out.println("Domingo");
                        break;}
                default:{System.out.println("No es un dia valido");
                        }
            }
    }

}
    

 


