package models;
public class BadToy extends Toy {
    private final String content;

    public BadToy(String id, String title, String content) {
        super(id, title);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toCSV() {
        return getId() + ",Malo," + getTitle() + "," + content;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contenido: " + content;
    }
}