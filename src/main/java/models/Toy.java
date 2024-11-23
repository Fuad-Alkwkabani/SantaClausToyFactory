package models;

public abstract class Toy {
    private final String id;
    private final String title;

    public Toy(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String toCSV(); // Método para exportar a CSV

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + title;
    }
}