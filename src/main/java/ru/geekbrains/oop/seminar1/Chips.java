package ru.geekbrains.oop.seminar1;

public class Chips extends Product{
    private double mass;
    private String flavor;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Chips(String name, String brand, double price, double mass, String flavor){
        super(name, brand, price);
        this.mass=mass;
        this.flavor=flavor;
    }

    @Override
    public String displayInfo() {
        return String.format("[Чипсы] %s - %s - %.2f - %.2f - %s", name, brand,price,mass,flavor);
    }
}
