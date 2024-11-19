package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return new ArrayList<>(toyList); 
    }

    
    public List<Toy> getToysByType(String tipo) {
        return toyList.stream()
                .filter(toy -> toy.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    
    public boolean deleteToyById(String id) {
        return toyList.removeIf(toy -> toy.getId().equalsIgnoreCase(id));
    }

    
    public String saveToString() {
        StringBuilder builder = new StringBuilder();
        for (Toy toy : toyList) {
            builder.append(toy.toString()).append("\n");
        }
        return builder.toString();
    }
}