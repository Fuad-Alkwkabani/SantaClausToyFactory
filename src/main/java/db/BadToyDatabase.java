package db;

import java.util.ArrayList;
import java.util.List;

import models.BadToy;

public class BadToyDatabase implements IDatabase<BadToy> {

    private List<BadToy> badToys;

    public BadToyDatabase() {
        badToys = new ArrayList<>();
    }

    @Override
    public void addToy(BadToy toy) {
        badToys.add(toy);
    }

    @Override
    public List<BadToy> getAllToys() {
        return badToys;
    }

    @Override
    public void deleteToy(String toyId) {
        badToys.removeIf(toy -> toy.getId().equals(toyId));
    }
}