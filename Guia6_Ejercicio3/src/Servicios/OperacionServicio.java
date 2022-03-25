
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    
    public Operacion crearOperacion(){
        
    Operacion op1 = new Operacion ();
    
    Scanner num = new Scanner(System.in);
            
    System.out.println("Ingrese el primer número");
    op1.setNum1(num.nextDouble());
    System.out.println("Ingrese el segundo número");
    op1.setNum2(num.nextDouble());
    return op1;
    }
    
    public double suma (Operacion op1){
     
        double sum = op1.getNum1()+ op1.getNum2();
        System.out.println(sum);
        return sum;
    }
    
    public double resta (Operacion op1){
        double dif = op1.getNum1()- op1.getNum2();
        return dif;
    }
    
    public double multiplicacion(Operacion op1){
        double prod;
        if ((op1.getNum1()==0)||(op1.getNum2()==0)){
            prod=0;
            System.out.println("La multiplicación es CERO porque al menos uno de los números a multiplicar es CERO");
            
        }else{
            prod=op1.getNum1()*op1.getNum2();
        }
        return prod;
    }
    
    public double division(Operacion op1){
        double div;
        if (op1.getNum2()==0){
            div=0;
            System.out.println("La divición es CERO porque el divisor es CERO");
            
        }else{
            div=op1.getNum1()/op1.getNum2();
        }
        return div;
    }
     
}
