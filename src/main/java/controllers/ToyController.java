package controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import models.BadToy;
import models.GoodToy;
import models.Toy;
import repository.ToyRepository;

public class ToyController {
 private ToyRepository toyRepository;

    public ToyController() {
        this.toyRepository = new ToyRepository();
    }

    public void addGoodToy(String title, String brand, String age, String category) {
        GoodToy goodToy = new GoodToy(title, brand, age, category);
        toyRepository.addToy(goodToy);
    }

    public void addBadToy(String title, String content) {
        BadToy badToy = new BadToy(title, content);
        toyRepository.addToy(badToy);
    }

    public List<Toy> getAllToys() {
        return toyRepository.getAllToys();
    }

    public List<GoodToy> getGoodToys() {
        return toyRepository.getAllToys().stream()
                .filter(toy -> toy instanceof GoodToy)
                .map(toy -> (GoodToy) toy)
                .collect(Collectors.toList());
    }

    public List<BadToy> getBadToys() {
        return toyRepository.getAllToys().stream()
                .filter(toy -> toy instanceof BadToy)
                .map(toy -> (BadToy) toy)
                .collect(Collectors.toList());
    }

    public boolean deleteToy(String toyId) {
        return toyRepository.deleteToy(toyId);
    }

    public void saveToysToCsv() throws IOException {
        List<Toy> toys = toyRepository.getAllToys();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toys.csv"))) {
            writer.write("ID,Título,Tipo,Detalles\n");
            for (Toy toy : toys) {
                if (toy instanceof GoodToy) {
                    GoodToy goodToy = (GoodToy) toy;
                    writer.write(toy.getId() + "," + toy.getTitle() + ",Bueno," +
                            "Marca: " + goodToy.getBrand() +
                            ",Edad: " + goodToy.getAge() +
                            ",Categoría: " + goodToy.getCategory() + "\n");
                } else if (toy instanceof BadToy) {
                    BadToy badToy = (BadToy) toy;
                    writer.write(toy.getId() + "," + toy.getTitle() + ",Malo," +
                            "Contenido: " + badToy.getContent() + "\n");
                }
            }
        }
    }

}


