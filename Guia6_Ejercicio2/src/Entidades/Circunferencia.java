


package Entidades;

public class Circunferencia {
    
    private double radio;

    
    public Circunferencia (double radio){
        this.radio = radio;
    }
    
    public Circunferencia (){
    }
    
    public double getRadio (){
        return radio;
    }
    
    public void setRadio (double radio){
        this.radio = radio;
    }
    
    public void creaCircunferencia (double radio){
        this.radio = radio;
    }
    
     public void calculaArea (double radio){
         System.out.println("El área de la circunferencia de radio "+ radio + " es " + (3.141516*radio*radio));
     }
     
     public void calculaPerimetro(double radio){
         System.out.println("El perímetro de la circunferencia de radio "+radio+" es " + (2*3.141516*radio));
     }
    
}
