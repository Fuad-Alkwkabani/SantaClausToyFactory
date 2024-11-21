package models;

public class GoodToy extends Toy {
    private String brand;
    private String age;
    private String category;

    public GoodToy(String title, String brand, String age, String category) {
        super(title);
        this.brand = brand;
        this.age = age;
        this.category = category;
    }
    



    public String getBrand() {
        return brand;
    }




    public void setBrand(String brand) {
        this.brand = brand;
    }




    public String getAge() {
        return age;
    }




    public void setAge(String age) {
        this.age = age;
    }




    public String getCategory() {
        return category;
    }




    public void setCategory(String category) {
        this.category = category;
    }




    @Override
    public String toString() {
        return super.toString() + ", Marca: " + brand + ", Edad Recomendada: " + age + ", Categoría: " + category;
    }
}
