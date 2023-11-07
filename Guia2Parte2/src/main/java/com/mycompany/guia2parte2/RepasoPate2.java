package com.mycompany.guia2parte2;

import java.util.Scanner;

public class RepasoPate2 {
    
    /*
1. Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/
    public static void ejer01parte2(){
        
    }
        //Scanner 
/*
2. Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/ 
    public static void ejer02parte2(){
        
        Scanner vari= new Scanner(System.in);
        System.out.println("Ingrese el valor de la variable A : ");   
        int A = vari.nextInt();
        System.out.println("Ingrese el valor de la variable B : ");   
        int B = vari.nextInt();
        System.out.println("Ingrese el valor de la variable C : ");   
        int C = vari.nextInt();
        System.out.println("Ingrese el valor de la variable D : ");   
        int D = vari.nextInt();
        int aux=0,A1,B1,C1,D1;
        // B tomo el valor de C
            aux= B;
            B1=C;
            C1=A;
            A1=D;
            D1=aux;
            System.out.println("El valor inicial de A = "+A+" y el final es A = "+A1);
            System.out.println("El valor inicial de B = "+B+" y el final es B = "+B1);
            System.out.println("El valor inicial de C = "+C+" y el final es C = "+C1);
            System.out.println("El valor inicial de D = "+D+" y el final es D = "+D1);
    }
/*
3. Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
contrario mostrar un mensaje.
*/ 
    public static void ejer03parte2(){
        
        Scanner leerV = new Scanner(System.in);
        System.out.println("Introduzca un carácter: ");
        char letra;
        letra = leerV.next().charAt(0);

            if(letra =='A'||letra =='E'|| letra =='I'|| letra =='O'|| letra =='U'){
                System.out.println("Se ingreso la vocal " +letra);     
            }else{
                System.out.println("El caracter ingresado no corresponde a una vocal y es " +letra);
            } 
}
/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
en romano.*/
    
    public static void ejer04parte2(){
        
        Scanner num=new Scanner(System.in);
        System.out.println("Ingrese un numero del1 al 10");
        int numero=num.nextInt();
        String roma;
   
        switch (numero){
            case 1:{ roma ="I";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 2:{roma ="II";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                        }break;
            case 3:{roma ="III"; 
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;        
            case 4:{roma ="IV";   
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;    
            case 5:{roma ="V";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 6:{roma ="VI";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 7:{roma ="VII"; 
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 8:{roma ="VIII";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 9:{roma ="IX";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            case 10:{roma ="X";
                    System.out.println("Se ingreso el numero "+ numero+" y su equivalente en romanos es "+roma);
                    }break;
            default:{System.out.println("El numero ingresado no corresponde" +numero);
            }break;
        }
    }
/*
5. Una obra social tiene tres clases de socios:
 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
los tipos de tratamientos.
 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
mismos tratamientos que los socios del tipo A.
 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
socio. Crear un método con el algoritmo para dar solución a lo propuesto.*/    
    public static void ejer05parte2(){
        
        Scanner leerV = new Scanner(System.in);
        System.out.println("Ingrese que tipo de socio es Clase 'A'Clase 'B'Clae'C': ");   
        char letra;
        letra = leerV.next().charAt(0);
        System.out.println("Costo del tratamiento sin descuento :");
        float peso=leerV.nextFloat();
        float pesosPagar=0; 
          
            if (letra=='A'|| letra =='B'|| letra =='C'||letra=='a'|| letra =='b'|| letra =='c'){
                if (letra =='A'||letra=='a'){
                    pesosPagar = peso -(peso*50/100); 
                }else if(letra =='B'||letra=='b'){
                    pesosPagar = peso -(peso*35/100); 
                    }else{
                        pesosPagar = peso;
                        }
                System.out.println("Socio tipo "+letra+" y el dinero a pagar es "+pesosPagar);
            }else{
                System.out.println("El codigo socio es incorrecto  ");    
            }             
    }
/*
6. Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
estaturas en general.
 */
    public static void ejer06parte2(){
        
            Scanner est=new Scanner(System.in);
            System.out.println("Ingrese la cantidad de personas a medir ");
            int personas=est.nextInt();
            int cont=0;
            float acu=0,acu1=0,contB=0;
            do{
                cont=cont +1;
                System.out.println("CONT"+cont);
                System.out.println("Ingrese su altura ");
                float estatura=est.nextFloat();        
                    if (estatura <1.60){
                        contB=contB+1;
                        acu= acu +estatura;
                    }else{
                        acu1= acu1 +estatura;
                    }
            }while( cont< personas);

            System.out.println("El promedio de estatura pordebajo de1.60 es : " +(acu/contB ));
            System.out.println("El promedio de estaturas en general es : " +(acu+acu1)/cont);
    }
/*
7. Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
n números (n>0). El valor de n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
con el bucle “do - while”.
*/
    public static void ejer07parte2(){
        
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeeros a procesar : ");
        int num = numero.nextInt();
        int cont=0,min=9999,max= -99999,contP=0,acu=0;
        float prom=0;
        
        while( num > cont){
            cont=cont +1;
            System.out.println("ingrese un numero : "+cont);
            int num1 = numero.nextInt();
                if (num1<min){
                    min=num1;
                    System.out.println("menor" +min);
                }else if(num1> max){
                    max=num1;
                    System.out.println("mayor "+max);
                }else if(num1>0){
                    acu=acu+num1;
                    contP=contP+1;
                }       
        }prom=acu/contP;
        System.out.println(" El mayor numero ingresado es : " +max); 
        System.out.println(" El menor numero ingresado es : " +min);  
        System.out.println(" El promedio de los numeros ingresado es : " +prom);  
    }
/*
8. Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break.
*/
        public static void ejer08parte2(){
            Scanner numero = new Scanner(System.in);
            System.out.println("Ingrese un numero entero : ");
            int num = numero.nextInt();
            int contN=0,contP=0,contI=0;
                do{

                    if (num % 2 == 0){
                        contP=contP+1;
                        System.out.println("par"+contP);
                    }else{
                        contI=contI+1;
                        System.out.println("impar"+contI);
                    }
                    if (num > 0){
                        contN=contN+1;
                        System.out.println("+"+contN);
                    }
                    System.out.println("Ingrese un numero entero : ");
                    num = numero.nextInt();
                    
                }while (num % 5 !=0  );
            System.out.println("La cantidad de numeros leidos es : " +contN);
            System.out.println("La cantidad de numeros pares es : " +contP);
            System.out.println("La cantidad de numeros impares es : " +contI);
        }
/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
Crear un método con el algoritmo necesario para dar solución a lo propuesto.
*/
        public static void ejer09parte2(){
            Scanner num=new Scanner(System.in);
            System.out.println("Ingrese un numero enteromayor que 1 ");
            int num1=num.nextInt();
            System.out.println("Ingrese otro numero entero mayor que 1 ");
            int num2=num.nextInt();
            int cont=0;
            while (num1 >= num2){
                cont=cont+1;
                int resta=num1-num2;
                System.out.println(num1+" - "+num2+" = "+resta +" -> "+cont+" resta realizadas");
                num1=resta;
            }
        }
/*
10. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
Math.random() de Java.
*/
        public static void ejer10parte2(){
            Scanner num=new  Scanner(System.in);
            System.out.println(" Se genera dos numeros aleatorio entre 0 y 10 ");
            int Num1 = (int) (Math.random() * 10), Num2 = (int) (Math.random() * 10),mult=1;
            System.out.println("1: " + Num1 + " y 2: " + Num2); 
            
            System.out.println("Adivine el resultado de la multiplicación ingrese el numero.");
            int adi=num.nextInt(); 
            mult = Num1 * Num2;
            
                if (mult== adi){
                    System.out.println("Su respuesta  es correcta ");
                }else {
                    System.out.println("Su respuesta es incorreca reingrese un numero ");
                    adi=num.nextInt(); 
                    while (mult!=adi){
                        System.out.println("Su respuesta no es correcta ");
                        System.out.println("Reingrese un numero");
                        adi=num.nextInt(); 
                        if (mult== adi){
                             System.out.println("Su respuesta  es correcta ");
                        }
                    }
                }
        }
/*
11. Escribir un método que lea un número entero y devuelva el número de dígitos que componen
ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
que las variables de tipo entero truncan los números o resultados.
*/
        public static void ejer11parte2(){
            
            System.out.println("Ingrese un numero entero");
            Scanner leer = new Scanner(System.in);
            int Num = leer.nextInt();
            int Num2, cont = 0;
            Num2 = Num;
                while (Num != 0) {
                    Num = Num / 10;
                    cont += 1;
                }
        System.out.println(Num2 + " tiene " + cont + " digitos.");
        System.out.println("");
             
         }
/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Crear un método que dé solución a lo propuesto en el enunciado.
*/
        public static void ejer12parte2(){
            System.out.println("EJECICIO 12");
                for (int i = 0; i < 10; i++) {//apertura primer digito
                    for (int j = 0; j < 10; j++) {//apertura segundo digito
                        for (int k = 0; k < 10; k++) {//apertura tercer digito
                            if (i == 3) {
                                    System.out.print("E");
                                } else {
                                    System.out.print(i);
                            }
                                System.out.print("-");
                            if (j == 3) {
                                    System.out.print("E");
                                } else {
                                    System.out.print(j);
                            }
                                System.out.print("-");
                            if (k == 3) {
                                    System.out.print("E");
                                } else {
                                    System.out.print(k);
                            }
                            System.out.println("");
                        }//cierre tercer digito
                    }//cierre segundo digito
                }//cierre primer digito
            System.out.println("");
        }
/*
13. Crear un método que dibuje una escalera de números, donde cada línea de números comience
en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123
    
  */  
        public static void ejer13parte2(){
             
            Scanner numero=new Scanner(System.in);
             
         }
    
}
