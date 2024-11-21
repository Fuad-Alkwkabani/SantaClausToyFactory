package repository;

import java.util.ArrayList;
import java.util.List;


import models.Toy;

public class ToyRepository {
    private List<Toy> toyList;

    public ToyRepository() {
        this.toyList = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    public List<Toy> getAllToys() {
        return new ArrayList<>(toyList); // Devolver una copia para evitar modificaciones externas
    }

    public boolean deleteToy(String toyId) {
        return toyList.removeIf(toy -> toy.getId().equals(toyId));
    }
}