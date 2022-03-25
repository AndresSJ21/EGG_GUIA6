
package guia6_ejercicio2;

import Entidades.Circunferencia;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia ();
        Scanner scan = new Scanner (System.in);
       
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = scan.nextDouble();
        
        c1.calculaArea(radio);
        c1.calculaPerimetro(radio);
        
    }
    
}
