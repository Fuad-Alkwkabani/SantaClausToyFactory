package models;

import java.util.UUID;

public abstract class Toy {
    private String id;
    private String title;

    public Toy(String title) {
        this.id = UUID.randomUUID().toString(); // Generar un ID único
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + title;
    }
}
