package controllers;

import java.util.ArrayList;
import java.util.List;
import dtos.BadToyDto;
import dtos.GoodToyDto;
import views.ElfView;
import views.SantaView;

public class ToyController {

    private final List<GoodToyDto> goodToys = new ArrayList<>();
    private final List<BadToyDto> badToys = new ArrayList<>();

    public ToyController(ElfView elfView, SantaView santaView) {
    }

    
    public void startElfSession() {
        ElfView.showElfMenu();
    }

    
    public void startSantaSession() {
        SantaView.showSantaMenu();
    }


    
    public void addGoodToy(String title, String brand, int recommendedAge, String category) {
        GoodToyDto newToy = new GoodToyDto(title, brand, recommendedAge, category);
        goodToys.add(newToy);
        System.out.println("Juguete para niños buenos añadido: " + title);
    }

    
    public void addBadToy(String title, String content) {
        BadToyDto newToy = new BadToyDto(title, content);
        badToys.add(newToy);
        System.out.println("Juguete para niños malos añadido: " + title);
    }

    
    public List<GoodToyDto> getGoodToys() {
        return goodToys;
    }

    
    public List<BadToyDto> getBadToys() {
        return badToys;
    }

    
    public void deleteToy(String title, boolean isGoodToy) {
        if (isGoodToy) {
            goodToys.removeIf(toy -> toy.title().equals(title));
            System.out.println("Juguete para niños buenos eliminado: " + title);
        } else {
            badToys.removeIf(toy -> toy.title().equals(title));
            System.out.println("Juguete para niños malos eliminado: " + title);
        }
    }

    
    public void exportToysToCSV() {
        System.out.println("Exportando juguetes a CSV...");
        
    }
}