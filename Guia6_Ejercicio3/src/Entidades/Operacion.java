package Entidades;
import java.util.Scanner;
public class Operacion {
    
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1 (){
        return num1;
    }
    
    public double getNum2 (){
        return num2;
    }
    
    public void setNum1 (double num1){
        this.num1=num1;
    }
    
    public void setNum2 (double num2){
        this.num2=num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
