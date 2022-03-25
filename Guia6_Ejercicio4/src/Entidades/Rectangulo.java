package Entidades;

/**
 * @author Andrés Panella
 */
public class Rectangulo {

// 1_ATRIBUTOS
    private int base;
    private int altura;

// 2_CONSTRUCTORES (VACIO Y CON PARAMETROS)
    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

// 3_GETTERS Y SETTERS
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
// 4_toString
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
