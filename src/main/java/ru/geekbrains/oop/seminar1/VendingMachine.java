package ru.geekbrains.oop.seminar1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products=products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public HotDrink getHotDrink(String name, double volume, double temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (product.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature ) {
                    return hotDrink;
                }
            }
        }
        return null;
    }

    public Chips getChips(String name, double mass, String flavor) {
        for (Product product:products){
            if (product instanceof Chips){
                Chips chips = (Chips) product;
                if (product.getName().equals(name) && chips.getMass() == mass && chips.getFlavor().equals(flavor)){
                    return chips;
                }
            }
        }
        return null;
    }
}
