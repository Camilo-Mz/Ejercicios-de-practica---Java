
package holamundo;

import java.util.Scanner;
public class Triangulo {
    
   private int lado1;
   private int lado2;
   private int lado3;
   private Scanner teclado;
   
   public void ingresar (){
   teclado = new Scanner (System.in);
       System.out.println("Ingresar el primer lado");
   lado1 = teclado.nextInt ();
       System.out.println("Ingresar  el segundo lado");
   lado2 = teclado.nextInt ();
       System.out.println("Ingresar el tercer lado");
   lado3 = teclado.nextInt ();
   }
   public void calcular (){
       if (lado1 == lado2 && lado2 == lado3){
           System.out.println("El triangulo es equilatero");
   }           
           if (lado1==lado2 || lado1==lado3||lado2==lado3){
               System.out.println("El triangulo es isoceles");
           }
              if (lado1!=lado2 && lado2 != lado3 && lado1 != lado3){
           System.out.println("El triangulo es escaleno");
       }
   }
   public void imprimir (){
       System.out.println("El valor del primer lado es: "+lado1);
       System.out.println("El valor del segundo lado es: "+lado2);
       System.out.println("El valor del tercer lado es: "+lado3);
   }
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo ();
        triangulo.ingresar ();
        triangulo.calcular ();
        triangulo.imprimir ();
                        
    }
   
   
   
}
