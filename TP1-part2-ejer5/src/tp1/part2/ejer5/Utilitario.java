/*
En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
 dibujaCuadrado(): Este método recibe un número entero N, y dibujará un cuadrado de N elementos 
por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de Utilitario:
 */
package tp1.part2.ejer5;

public class Utilitario {
    
    private static int num;

    public Utilitario() {
    }
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Utilitario.num = num;
    }
    //a) Dibujar un cuadrado de 5 elementos.
    public static void dibujaCuadrado(int num){
        
        for (int i=0;i < num;i++){
            for (int j=0;j<num;j++){    
                if(i==0 ||i==num-1 || j==0 || j==num-1 ){    
                    System.out.print("*");    
                }else{
                    System.out.print(" ");
                    }
                }
             System.out.println(" ");
        }
    }
    //b) Mostrar el mayor entre (20,75 y 40)   
    public static void elMayorEs(int n1,int n2,int n3){
    /*
     elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el mayor. En caso de ser iguales 
     lo deberá informar.
    */
        if (n1<n2 &&n2<n3){  
            System.out.println(" El mayor numero ingresado es el tercero :");   
        }else if( n1>n2 && n2>n3){
            System.out.println("El mayor numero ingresado es el primero :");    
        }else if(n2<n3 && n2<n1 || n2>n3 && n2>n1){   
            System.out.println("El mayor numero ingresado es el segundo :");
        }
    }
    //c) Mostrar el nombre del día 5.
    public  static void elDiaEs(int num){
    /* elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que corresponderá a un día de la semana, 
    retornando el nombre que le corresponda, por ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado,
    7 Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
    */
    //6) En un nuevo proyecto, crear una clase de nombre          
    switch (num){
        
            case 1:{System.out.println("Lunes");
                    break;}  
            case 2:{System.out.println("Martes");
                    break;}
            case 3:{System.out.println("Miercolea");
                    break;}
            case 4:{System.out.println("Jueves");
                     break;}
            
            case 5:{System.out.println("Viernes");
                    break;}
            
            case 6:{System.out.println("Sabado");
                    break; }
            case 7:{System.out.println("Domingo");
                    break;}
            default:{System.out.println("No existe ese día!!!");
                    break;}   
        }              
    }
}
