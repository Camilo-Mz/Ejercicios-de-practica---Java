
package holamundo;

import java.util.Scanner;
public class Sueldo {
      
    private String nombre;
    private int salario;
    private Scanner teclado;
            
    public void ingresar (){
    teclado = new Scanner (System.in);
    System.out.println("ingresar nombre");
    nombre = teclado.next();
    System.out.println("ingresar el sueldo");
    salario =  teclado.nextInt();        
    }    
    public void calcular (){
    if (salario > 3000000){
    System.out.println("Debe pagar impuesto");
    }
    else {
    System.out.println("No paga impuesto");
      }
    }
    public void imprimir () {
    System.out.print("  "+nombre);
    System.out.println(" tiene un sueldo de: "+salario);
    }  
    public static void main(String[] args) {
    {
        Sueldo sueldo = new Sueldo();                            
        sueldo.ingresar();                            
        sueldo.calcular();                            
        sueldo.imprimir();
      }
   }
}
