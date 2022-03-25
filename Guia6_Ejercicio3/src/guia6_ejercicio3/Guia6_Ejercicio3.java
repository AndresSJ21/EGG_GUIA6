
package guia6_ejercicio3;
import Entidades.Operacion;
import Servicios.OperacionServicio;

public class Guia6_Ejercicio3 {

   public static void main(String[] args) {
    
       OperacionServicio ops = new OperacionServicio();
       
       Operacion op1 = ops.crearOperacion();
       
       double sum1, rest1, mult1, div1;
               
              
       sum1=ops.suma(op1);
       System.out.println("La suma es igual a " + sum1);
       
       rest1=ops.resta(op1);
       System.out.println("La resta es igual a " + rest1);
       
       mult1=ops.multiplicacion(op1);
       System.out.println("La multiplicación es igual a " + mult1);
       
       div1=ops.division(op1);
       System.out.println("La división es igual a " + div1);
   
   } 
}
