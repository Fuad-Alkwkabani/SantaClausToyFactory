package controllers;

import java.util.List;

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

    public boolean deleteToy(String toyId) {
        return toyRepository.deleteToy(toyId);
    }

}


