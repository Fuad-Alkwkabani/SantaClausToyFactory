package controllers;

import java.util.List;

import models.Toy;
import repository.ToyRepository;

public class ToyController {
 private ToyRepository toyRepository;

   

    public ToyController(ToyRepository toyRepository) {
    this.toyRepository = new ToyRepository();
    }

    public void addToy(Toy toy) {
        toyRepository.addToy(toy);
        System.out.println("Juguete añadido con éxito: " + toy);
    }
    public List<Toy> getAllToys() {
        return toyRepository.getAllToys();
    }

    public List<Toy> getToysByType(String tipo) {
        return toyRepository.getToysByType(tipo);
    }
    public boolean deleteToy(String id) {
        boolean removed = toyRepository.deleteToyById(id);
        if (removed) {
            System.out.println("Juguete eliminado con éxito (ID: " + id + ")");
        } else {
            System.out.println("Juguete no encontrado (ID: " + id + ")");
        }
        return removed;
    }

    public String saveAllToysToString() {
        return toyRepository.saveToString();
    }

}


