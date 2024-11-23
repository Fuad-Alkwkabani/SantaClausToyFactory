package repository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import dtos.GoodToyDto;
import models.BadToy;
import models.GoodToy;
import models.Toy;

public class ToyRepository {

    // Almacenes de juguetes
    private final List<Toy> goodToys = new ArrayList<>();
    private final List<Toy> badToys = new ArrayList<>();

    // Singleton
    private static ToyRepository instance;

    private ToyRepository() {}

    public static ToyRepository getInstance() {
        if (instance == null) {
            instance = new ToyRepository();
        }
        return instance;
    }

    // Métodos de gestión de juguetes
    public void addGoodToy(String title, String brand, int recommendedAge, String category) {
        GoodToyDto toy = new GoodToyDto(title, brand, recommendedAge, category);
        goodToys.add(new GoodToy(UUID.randomUUID().toString(), toy));
    }

    public void addBadToy(String title, String content) {
        BadToy toy = new BadToy(UUID.randomUUID().toString(), title, content);
        badToys.add(toy);
    }

    public List<Toy> getGoodToys() {
        return new ArrayList<>(goodToys);
    }

    public List<Toy> getBadToys() {
        return new ArrayList<>(badToys);
    }

    public List<Toy> getAllToys() {
        // Combinar ambas listas de juguetes
        List<Toy> allToys = new ArrayList<>(goodToys);
        allToys.addAll(badToys);
        return allToys;
    }

    public boolean deleteToy(String id) {
        return goodToys.removeIf(toy -> toy.getId().equals(id)) || 
               badToys.removeIf(toy -> toy.getId().equals(id));
    }

    public boolean saveToCSV() {
        try (FileWriter writer = new FileWriter("toys.csv")) {
            writer.write("ID,Tipo,Detalles\n");

            for (Toy toy : getAllToys()) {
                writer.write(toy.toCSV());
                writer.write("\n");
            }

            return true; // Éxito
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Error al escribir el archivo
        }
    }
}