package ru.geekbrains.oop.seminar1;


public class Product {
    protected String name; // Наименование
    protected String brand; // Название бренда
    protected double price; // Стоимость

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    Product(){
        this("Noname");
    }
    public Product(String name){
        this(name, "Noname");
    }
    public Product(String name, String brand){
        this(name,brand,100);
    }
    public Product(String name, String brand, double price){

        checkName(name);
        checkBrand(brand);

        if (price < 100){
            throw new RuntimeException("Некорректная цена товара.");
        }
            this.price = price;
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "Noname";
        }
        this.name = name;
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "Noname";
        }
        this.brand=brand;
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }
}
