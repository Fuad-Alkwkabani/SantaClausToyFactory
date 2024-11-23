package db;

import java.util.List;

import models.BadToy;
import models.GoodToy;

public class ToysDB {

    private GoodToyDatabase goodToyDatabase;
    private BadToyDatabase badToyDatabase;

    public ToysDB() {
        goodToyDatabase = new GoodToyDatabase();
        badToyDatabase = new BadToyDatabase();
    }

    public void addGoodToy(GoodToy toy) {
        goodToyDatabase.addToy(toy);
    }

    public void addBadToy(BadToy toy) {
        badToyDatabase.addToy(toy);
    }

    public List<GoodToy> getAllGoodToys() {
        return goodToyDatabase.getAllToys();
    }

    public List<BadToy> getAllBadToys() {
        return badToyDatabase.getAllToys();
    }

    public void deleteGoodToy(String toyId) {
        goodToyDatabase.deleteToy(toyId);
    }

    public void deleteBadToy(String toyId) {
        badToyDatabase.deleteToy(toyId);
    }
}
