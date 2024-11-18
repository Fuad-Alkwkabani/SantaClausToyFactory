package models;

public class GoodToy extends Toy {

    private String marca;
    private String edadRecomendada;
    private String categoria;
    
    public GoodToy(String id, String titulo, String tipo, String marca, String edadRecomendada, String categoria) {
        super(id, titulo, tipo);
        this.marca = marca;
        this.edadRecomendada = edadRecomendada;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(String edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
