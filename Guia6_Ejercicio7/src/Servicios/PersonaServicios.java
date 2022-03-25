
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 * @author Andrés Panella
 */
public class PersonaServicios {
    
    //creamos objeto Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        
    public Persona crearPersona(){
        //instanciamos objeto
        Persona p1 = new Persona();
                
        System.out.println("Ingrese los siguientes datos de la persona:");
        System.out.println("Nombre:");
        p1.setNombre(leer.next());
                
        System.out.println("Edad");
        p1.setEdad(leer.nextInt());
                
        System.out.println("Sexo: H-Hombre // M-Mujer // O-Otro");
        p1.setSexo(leer.next());
        
        while (((p1.getSexo().equals("H"))||(p1.getSexo().equals("M"))||(p1.getSexo().equals("O")))==false){
           System.out.println("El dato ingresado no es correcto, ingrese opción válida");
           System.out.println("Sexo: H-Hombre // M-Mujer // O-Otro");
           p1.setSexo(leer.next());
        } 
        
        System.out.println("Peso [Kg]");
        p1.setPeso(leer.nextDouble());
        
        System.out.println("Altura [m]");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    }
    
    public int imc (Persona p){
        int indice;
        Double imasac = (p.getPeso()/(p.getAltura()*p.getAltura()));
        if (imasac<20){
            indice=(-1);
            return indice;
        }else if ((imasac>=20)&&(imasac<=25)){
            indice=0;
            return indice;
        }else {
            indice=1;
            return indice;
        }
    }
    
    public boolean esMayor (Persona p){
    boolean mayor;
    if (p.getEdad()>=21){
        mayor=true;
    } else{
        mayor = false;
    }
    return mayor;
    }
}
