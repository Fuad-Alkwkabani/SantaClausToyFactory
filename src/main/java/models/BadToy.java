package models;

public class BadToy extends Toy {

    private String contenido;

    public BadToy(String id, String titulo, String tipo, String contenido) {
        super(id, titulo, tipo);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
}
