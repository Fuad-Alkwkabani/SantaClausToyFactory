package models;

import dtos.GoodToyDto;

public class GoodToy extends Toy {
    private final GoodToyDto details;

    public GoodToy(String id, GoodToyDto details) {
        super(id, details.title());
        this.details = details;
    }

    public GoodToyDto getDetails() {
        return details;
    }

    @Override
    public String toCSV() {
        return getId() + ",Bueno," + details.title() + "," + details.brand() + "," + details.recommendedAge() + "," + details.category();
    }

    @Override
    public String toString() {
        return super.toString() + ", Marca: " + details.brand() + ", Edad recomendada: " + details.recommendedAge() + ", Categoría: " + details.category();
    }
}