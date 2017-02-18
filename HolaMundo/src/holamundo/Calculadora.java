
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENA
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a=0, b=0, resultado=0, num=0;
        
        System.out.println("Escriba la opción");  
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        
        num = entrada.nextInt (); 
        
        switch (num)
                {
            case 1:
                System.out.println("Ingrese el primer numero");
                a = entrada.nextInt (); 
                System.out.println("Ingrese el segundo numero");
                b = entrada.nextInt ();   
        
                resultado=a+b;
                System.out.println("el resultado es:"+" "+resultado);
                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                a = entrada.nextInt (); 
                System.out.println("Ingrese el segundo numero");
                b = entrada.nextInt ();           
        
                resultado=a-b;
                System.out.println("El resultado es:"+" "+resultado);
                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                a = entrada.nextInt (); 
                System.out.println("Ingrese el segundo numero");
                b = entrada.nextInt ();           
        
                resultado=a*b;
                System.out.println("el resultado es:"+" "+resultado);
                break;
            case 4:
                System.out.println("Ingrese el primer numero");
                a = entrada.nextInt (); 
                System.out.println("Ingrese el segundo numero");
                b = entrada.nextInt ();           
        
                resultado=a / b;
                System.out.println("el resultado es:"+"  "+resultado);
                break;
                
            default:
                System.out.println("ERROR(opcion no valida)");
                break;
                        
        }
              
    }
}
