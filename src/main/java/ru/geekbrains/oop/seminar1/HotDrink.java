package ru.geekbrains.oop.seminar1;

public class HotDrink extends Product{
    private double volume;
    private double temperature;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, String brand, double price, double volume, double temperature){
        super(name, brand, price);
        this.volume=volume;
        this.temperature=temperature;
    }

    @Override
    public String displayInfo() {
        return String.format("[Горячий напиток] %s - %s - %.2f - %.2f - %.2f",name,brand,price,volume,temperature);
    }
}
