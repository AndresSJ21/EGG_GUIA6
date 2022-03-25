
package Entidades;

/**
 * @author Andrés Panella
 */
public class Puntos {

//atributos    
private double[] p1=new double[2];
private double[] p2=new double[2];
 
//constructores
public Puntos (){
    
}
public Puntos(double[] p1, double[] p2){
    this.p1=p1;
    this.p2=p2;
}
  
//getters and setters
public double[] getP1(){
    return p1;
}
public double[] getP2(){
    return p2;
}

public void setP1(double x1, double y1){
    this.p1[0]=x1;
    this.p1[1]=y1;
}


public void setP2(double x2, double y2){
    this.p2[0]=x2;
    this.p2[1]=y2;
}

    @Override
    public String toString() {
        return "Punto P1=\n"
                + "   [x1:" + p1[0] + " ; y1:" + p1[1] + "]\n"
                +"Punto P2=\n"
                + "   [y1:" + p2[0] + " ; y2:" + p2[1] + "]\n";
    }




}
