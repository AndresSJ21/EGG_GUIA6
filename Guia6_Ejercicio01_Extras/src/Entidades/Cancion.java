
package Entidades;

/**
 * @author Andrés Panella
 */
public class Cancion {

private String titulo;
private String autor;

public Cancion(){
    this.titulo="";
    this.autor="";
}

public Cancion(String titulo, String autor){
    this.titulo=titulo;
    this.autor=autor;
}

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
}
