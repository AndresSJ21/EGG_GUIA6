
package guia6_ejercicio7;
import Entidades.Persona;
import Servicios.PersonaServicios;
/* @author Andrés Panella
 */
public class Guia6_Ejercicio7 {

    public static void main(String[] args) {
    PersonaServicios ps = new PersonaServicios();
    
    Persona [] personas =new Persona[4];
    
    int cuentaMayores=0, imcbajo=0, imcok=0, imcalto=0;
    double mayores, menores, imcBajo, imcOk, imcAlto;
    
    for (int i=0; i<4; i++){
        personas[i] = ps.crearPersona();
       
        boolean esMayor= ps.esMayor(personas[i]);
        
        System.out.println(esMayor);
        int imc=ps.imc(personas[i]);
        System.out.println(imc);
        
        System.out.println(personas[i]);
        if (personas[i].getEdad()>21){
            cuentaMayores ++;
        }
        if (imc<1){
            imcbajo++;
        }else if (imc==0){
            imcok++;
        }else{
        imcalto++;
        }

    }
    
    mayores = cuentaMayores*100/4;
    menores = (4-cuentaMayores)*100/4;
    imcBajo = imcbajo*100/4;
    imcOk = imcok*100/4;
    imcAlto = imcalto*100/4;
    
    System.out.println("El porcentaje de personas mayores es "+ mayores);
    System.out.println();
    System.out.println("El porcentaje de personas menores es "+ menores);
    System.out.println();
    System.out.println("El porcentaje de personas con peso menor al ideal es "+ imcBajo);
    System.out.println();
    System.out.println("El porcentaje de personas con peso ideal es "+ imcOk);
    System.out.println();
    System.out.println("El porcentaje de personas con peso superior al ideal es "+ imcAlto);
    System.out.println();
    
    }

}
