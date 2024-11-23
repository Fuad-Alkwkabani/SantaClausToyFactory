package db;

import java.util.ArrayList;
import java.util.List;

import models.GoodToy;

public class GoodToyDatabase implements IDatabase<GoodToy> {

    private List<GoodToy> goodToys;

    public GoodToyDatabase() {
        goodToys = new ArrayList<>();
    }

    @Override
    public void addToy(GoodToy toy) {
        goodToys.add(toy);
    }

    @Override
    public List<GoodToy> getAllToys() {
        return goodToys;
    }

    @Override
    public void deleteToy(String toyId) {
        goodToys.removeIf(toy -> toy.getId().equals(toyId));
    }
}
