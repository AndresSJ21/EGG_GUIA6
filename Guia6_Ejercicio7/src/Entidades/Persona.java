
package Entidades;

import Servicios.PersonaServicios;

/**
 * @author Andrés Panella
 */
public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private String sexo;
    private Double peso;
    private Double altura;
    
    //constructores
    public Persona (){
        
    }
    
    public Persona (String nombre, int edad, String sexo, Double peso, Double altura){
        this.nombre = nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    
    //getters and setters
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public Double getPeso (){
        return peso;
    }
    
    public void setPeso(Double peso){
        this.peso=peso;
    }
    
    public Double getAltura(){
        return altura;
    }
    public void setAltura(Double altura){    
        this.altura=altura;
    }
    
    //toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }


}
