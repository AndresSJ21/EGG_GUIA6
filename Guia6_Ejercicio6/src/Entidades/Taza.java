
package Entidades;

/**
 * @author Andrés Panella
 */
public class Taza {

    //parametros
    private Double capacidadTaza;
    private Double nivelActualTaza;
    
    // constructores
     public Taza() {
    }
    
        public Taza(Double capacidadTaza, Double nivelActualTaza) {
        this.capacidadTaza = capacidadTaza;
        this.nivelActualTaza = nivelActualTaza;
        }
        
        
    //getters y setters
    
    public Double getCapacidadTaza() {
        return capacidadTaza;
    }

    public void setCapacidadTaza(Double capacidadTaza) {
        this.capacidadTaza = capacidadTaza;
    }

    public Double getNivelActualTaza() {
        return nivelActualTaza;
    }

    public void setNivelActualTaza(Double nivelActualTaza) {
        this.nivelActualTaza = nivelActualTaza;
    }
        
    
    // toString

    @Override
    public String toString() {
        return "Taza{" + "capacidadTaza=" + capacidadTaza + ", nivelActualTaza=" + nivelActualTaza + '}';
    }
    
    




   
}
