
package Entidades;

/**
 * @author Andrés Panella
 */
public class Cadena {
    
    //atributos
    private String frase;
    private int longFrase;
    
    //constructores
    public Cadena(){
    }
    
    public Cadena(String frase, int longFrase){
        this.frase=frase;
        this.longFrase=longFrase;
    }
    
    //getters y setters
    public String getFrase (){
        return frase;
    }
    
    public void setFrase (String frase){
        this.frase=frase;
    }
    
    public int getLongFrase (){
        return longFrase;
    }
    
    public void setLongFrase (int longFrase){
        this.longFrase=longFrase;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    }
    
    
}
