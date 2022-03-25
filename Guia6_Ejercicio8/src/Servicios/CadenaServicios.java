
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;
/**
 * @author Andrés Panella
 */
public class CadenaServicios {

    //metodos
    
    //ingresa frase
    public Cadena ingresaFrase(){
        Cadena c1= new Cadena();
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, ingresá una frase");
        System.out.println();
        c1.setFrase(leer.nextLine());
        c1.setLongFrase(c1.getFrase().length());
        System.out.println(c1);
        
        return c1;
    }
    
    
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada
    public int mostrarVocales (Cadena c){
    String vocales=null;
    int contadorVocales=0;
    String vocal;
    for (int i=0; i<(c.getLongFrase());i++){   
        vocal=c.getFrase().substring(i, i+1);
        if (vocal.equalsIgnoreCase("a")||vocal.equalsIgnoreCase("e")||vocal.equalsIgnoreCase("i")||vocal.equalsIgnoreCase("o")||vocal.equalsIgnoreCase("u")){
            contadorVocales++;
        }
    }
    return contadorVocales;
    }  
    
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase (Cadena c){
    String invertida="";
    for (int i=c.getLongFrase()-1;i>=0;i--){
        invertida=invertida.concat(c.getFrase().substring(i, i+1));
    }
    return invertida;
    }
    
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    //y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido (Cadena c){
        int repetido=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese caracter a buscar");
        String seRepite = leer.next();
        for (int i=0;i<c.getLongFrase();i++){
            if (c.getFrase().substring(i, i+1).equals(seRepite)){
                repetido++;
            }
        }
        return repetido;
    }
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
    //que compone la clase con otra nueva frase ingresada por el usuario.
    public String comparaLongitud (Cadena c){
        String compara1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase para comparar longitudes");
        String frase2=leer.nextLine();
        if (c.getLongFrase()<frase2.length()){
            compara1="La segunda frase es más larga";
        }else if (c.getLongFrase()==frase2.length()){
            compara1="Ambas frases tienen la misma longitud";
        }else {
            compara1="La segunda frase es más corta";
        }
        return compara1;
    }
    
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrase(Cadena c){
        String unidas;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase para agregar a la inicial");
        String fraseAunir=leer.nextLine();
        unidas=c.getFrase().concat(" "+fraseAunir);
        return unidas;
    }
    
    
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.
    public String reemplaza (Cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese caracter por el que reemplazará la letra -a-");
        String reemplaza2=c.getFrase().replace("a", leer.next());
        return reemplaza2;
    }
    
    
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public String contiene (Cadena c){
        Scanner leer = new Scanner(System.in);
        String contenido;
        System.out.println("Ingrese un caracter a buscar y le diremos si está presente en la frase original");        
        if (c.getFrase().contains(leer.next())){
            contenido="VERDADERO";
            return contenido;
        }else{
            contenido="Falso";
            return contenido;
        }
    }
    
}
