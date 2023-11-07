package com.mycompany.guia2;

import java.util.Locale;
import java.util.Scanner;

public class Guia2 {
  
    public static void main(String[] args) {    
  /*
*1. Escribir un método que pida dos números enteros por teclado y calcule la 
suma de los dos mostrando por consola la suma de los mismos.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int n1= leer.nextInt();
        System.out.println("Ingrese otro numero :");
        int n2= leer.nextInt();
        
        System.out.println(" La suma es = "+(n1+n2));
 */       
/*
2. Escribir un método que pida tu nombre, lo guarde en una variable y lo
    muestre por pantalla.   

        Scanner nom = new Scanner(System.in); 
        System.out.println(" Ingrese su nombre ");
        String nombre = nom.nextLine();
        System.out.println("el nombre ingresado es : " +nombre);
  */
/*
3. Escribir un método que pida una frase y la muestre toda en mayúsculas y 
   después toda en minúsculas. Nota: investigar los métodos toUpperCase() 
    y toLowerCase() de la clase String.
    
        Scanner fra = new Scanner( System.in); 
        System.out.println("Ingrese una frase en minuscula ");
        String frase = fra.nextLine();
        System.out.println("Convertida a mayuscula ->"+frase.toUpperCase());//minuscula a mayuscula
        System.out.println(" Combierte a minuscula ->"+ frase.toLowerCase());//mayuscula a minuscula
*/       
/*
4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).    

        Scanner gra= new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados ");
        float grados=gra.nextFloat();
        float F = 32 + (9 * grados / 5);
        System.out.println("El equivalente en grados Fahrenheit :"+F);
*/
/*
5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().
En un nuevo proyecto de nombre “repasoB” crear una clase de nombre GuiaB y dentro de esta,
crear un método estático para cada ejercicio propuesto; luego pruébelo desde el método main de
una clase PruebaRepasoB.

        Scanner  num=new Scanner(System.in);
        System.out.println(" Ingrese un numero entero ");
        int numero= num.nextInt();
        System.out.println("El doble del numero ingresado es : "+ 2*numero);
*/
//Condicionales en Java
/*
6. Implementar un método que reciba por parámetro dos números enteros y determine cuál es
el mayor y lo muestre por pantalla.

        Scanner nu1=new Scanner(System.in);
        System.out.println(" Ingrese un numero entero ");
        int nume1=nu1.nextInt();
        System.out.println(" Ingrese otro numero entero ");
        int nume2=nu1.nextInt();
        // recibe 2 num por parametro devuelve el mayor
        System.out.println("El mayor de los dos números es " + Math.max(nume1, nume2));
 */       
/*
7. Crear un método que reciba por parámetro un numero y determine si es par o impar. 

        Scanner num=new Scanner(System.in);
        System.out.println(" Ingrese un numero entero ");
        int numero=num.nextInt();
        // % es usado como mod
        if (numero % 2 == 0){
            System.out.println("El números es par " + numero);
    }else {
            System.out.println("El números es impar " + numero);
           }
   */  
/*
8. Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals()
de String.
      
        String frase1="eureka";
        Scanner fra=new Scanner(System.in);
        System.out.println(" Ingrese una frase ");
        String frase = fra.nextLine();
       // System.out.println(frase.equals(frase1)); en caso de boolean
            
        if (frase1.equals(frase)){
            System.out.println("Correcto");
        }else{  
            System.out.println("Incorrecto");
        }
*/              
/*
9. Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
el método lenght() de String.
  // El método length () de String devuelve la longitud de una cadena S1.
        Scanner fra=new Scanner(System.in);
        System.out.println(" Ingrese una frase de 8 caracteres ");
        String frase = fra.nextLine();  
        int fr= frase.length();//longitud de la cadena
        System.out.println("Longitud de una cadena es:" + fr);       
       
         if (fr == 8){
            System.out.println("Correcto");
        }else{  
            System.out.println("Incorrecto");
        }
*/        
/*
10. Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una
‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

        String frase1= "A";
        Scanner fra=new Scanner(System.in);
        System.out.println(" Ingrese una frase ");
        //.toUpperCase() combierte minuscula amayuscula
        String frase = fra.nextLine().toUpperCase(); 
        // me lee la posicion 0 del vector 
        String f=frase.substring(0,1);
        
        if ( frase1.equals(f) ) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
*/            
/*
11. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una
variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar
lo siguiente:
 Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
 Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
 Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
 Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
 Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
  válido para tipo de bomba”

En un nuevo proyecto de nombre “repasoC” crear una clase de nombre GuiaC y dentro de esta,
crear un método estático para cada ejercicio propuesto; luego pruébelo desde el método main de
una clase PruebaRepasoC.

    Scanner moto=new Scanner(System.in);
    System.out.println(" Ingrese un valor entre 1 y 4");
    int  tipoMotor = moto.nextInt();
 
        switch (tipoMotor){
                case 1:{System.out.println("La bomba es una bomba de agua");
                    }
                    break;
                case 2:{System.out.println("La bomba es una bomba de gasolina");
                }
                    break;
                    
                case 3:{System.out.println("La bomba es una bomba de hormigón");
                    }
                    break;
                case 4:{System.out.println("La bomba es una bomba de pasta alimenticia");
                }
                break;
                default:{System.out.println("No existe un valor válido para tipo de bomba");
                }
                break;  
    }
 */       
//Bucles y sentencias de salto break y continue
/*
12. Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

        Scanner no=new Scanner(System.in);
        System.out.println(" Ingrese una nota entre 0 y 10 ");
        int nota=no.nextInt();
 
        while (nota < 0 || nota > 10 ){
           System.out.println(" Ingrese otra nota entre 0 y 10 ");
           nota=no.nextInt();         
        }
*/        
/*
13. Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

        Scanner valor=new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo ");
        int v1=valor.nextInt();
        int aux=0;

            for (int j=0;j<v1;j++){ 
                System.out.println("Ingrse un numero");
                int v2=valor.nextInt();
                    if(v1>=v2){
                        aux=aux+v2;
                    }
            }  
        System.out.println("La suma de los numeros introducidos supera al limite inicial en : "+aux);
*/   
/*
14. Realizar un método que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego
volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el
siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario selecciona
el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entero psitivo : ");
    int n1= leer.nextInt();
    System.out.println("Ingrese otro numero entero positivo:");
    int n2= leer.nextInt();
    
    System.out.println("            MENU");
    System.out.println("************************");
    System.out.println("        1. Sumar");
    System.out.println("        2. Restar");
    System.out.println("        3. Multiplicar");
    System.out.println("        4. Dividir");
    System.out.println("        5. Salir");
    System.out.println("        Elija opción:");
    
    Scanner opcion=new Scanner(System.in);
    System.out.println(" Ingrese la opcion deseada");
    int  op = opcion.nextInt();
    
   
        do{//(op>=1 || op<=4)
                
        switch (op){
                case 1:{System.out.println("La suma es = "+ (n1+n2));
                        System.out.println(" Ingrese la opcion deseada");
                        op = opcion.nextInt();
                    }break;
                    
                case 2:{System.out.println("La resta es = "+(n1-n2));
                        System.out.println(" Ingrese la opcion deseada");
                        op = opcion.nextInt();
                }break;
                    
                case 3:{System.out.println("La multiplicacion es = "+(n1*n2));
                        System.out.println(" Ingrese la opcion deseada");
                        op = opcion.nextInt();
                    }break;
                    
                case 4:{System.out.println("La division es = "+(n1/n2));
                        System.out.println(" Ingrese la opcion deseada");
                        op = opcion.nextInt();
                }break;
                
                case 5:{System.out.println("SALIR");
                }break;
                
                default:{System.out.println("Elija opción:");
                         System.out.println(" Ingrese la opcion deseada");
                         op = opcion.nextInt();
                }break;  
                }
            }while(op!= 5);
        }
*/
/*
15. Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota:
recordar el uso de la sentencia break.

        Scanner numero = new Scanner(System.in);
        int num;
        
            do{
                System.out.println("Ingrese un numero : ");
                num= numero.nextInt();
            }while(num != 0 && num <=20);
*/
/*
16. Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que
no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe
indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(),
equals().
        No se pueden utilizar como variables da error
            int lg = rs.length();
            String lg1=rs.substring(0,1); 
            String lg2=rs
            if( lg1.equalsIgnoreCase("x") && lg2.endsWith("o") && (rs.length() == 5 ) )
        
        Scanner rs232=new Scanner(System.in);
        System.out.println("Ingrse una cadena de maximo 5 caracteres ");
        String rs=rs232.nextLine();*/
/*        int cont=0,cont2=0;
        
            while ( !rs.equals("&&&&&")){
                
                if(  rs.substring(0,1).equalsIgnoreCase("x")&& rs.endsWith("o")&& (rs.length() == 5 ) ){
                        cont =cont+1;  
                        System.out.println("Cantidad de correcta es :"+cont);
                    }else {
                        cont2=cont2+1;
                        System.out.println("Cantidad de  incorrecta es :"+cont2);
                    } 
                    
                System.out.println("Ingrse una nueva cadena de 5 caracteres ");
                rs=rs232.nextLine();     
            }
            System.out.println("Cantidad de cadenas ingresadas de forma  correcta es :"+cont);
            System.out.println("Cantidad de cadenas ingresadas de forma  incorrecta es :"+cont2);
           //https://www.youtube.com/watch?v=aQ3fbOGOrkQ 
 */          
/*
17. Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
El valor de N se ingresará por teclado y en este caso utilice la estructura while para dibujarlo.

        Scanner numero=new Scanner(System.in);
        System.out.println("Ingrese un numero :");
        int num=numero.nextInt();

            for (int i=0;i < num;i++){
                for (int j=0;j<num;j++){
                    if(i==0 ||i==num-1 || j==0 || j==num-1 ){                                                                     
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
             System.out.println(" ");
        }*/
/*
18. Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
        Scanner numero=new Scanner(System.in);
        System.out.println(" Ingrese un numero entere 1 y 20 ");
        int num=numero.nextInt();

            for (int i=1;i<4;i++){        
                if( num<=20 && num>=1){
                    System.out.print(num);
                    for(i=1;i<=num;i++){
                        System.out.print("*");
                    }
                }
            } 
    }
}
