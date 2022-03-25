package Entidades;

public class Raices {

    //Atributos
    private double a;
    private double b;
    private double c;
    
    //Constructor
    public Raices (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    //getters and setters
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    
    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }
    public void setC(double c){
        this.c=c;
    }
    
    
    @Override
    public String toString(){
        
        return "Coeficientes de la ecuacion de Grado 2: /n"
                + "_____ a: "+a+" ; b: "+b+" ; c: "+c+" _____";
    }
    
    
}
