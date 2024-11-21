package models;

public class BadToy extends Toy {
    private String content;

    public BadToy(String title, String content) {
        super(title);
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenido: " + content;
    }
}