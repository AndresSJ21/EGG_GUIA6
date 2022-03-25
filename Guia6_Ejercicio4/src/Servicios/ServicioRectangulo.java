
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;
/**
 * @author Andrés Panella
 */
public class ServicioRectangulo {
    
    
    public Rectangulo crearRectangulo (){
        Rectangulo r1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo");
        r1.setAltura(leer.nextInt());
        
        return r1;
     
    }
    
    public int Superficie (Rectangulo r1){
                
        return r1.getBase()*r1.getAltura();
    }
    
    public int Perimetro (Rectangulo r1){
        return r1.getAltura()*2+r1.getBase()*2;
    }
    
    public void Dibuja (Rectangulo r1){
        for (int i=0; i<r1.getAltura();i++){
            for (int j=0; j<r1.getBase();j++){
                if (i==0 || i==(r1.getAltura()-1)){
                    System.out.print(" *");
                }else if (j==0 ||j==r1.getBase()-1){
                    System.out.print(" *");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
