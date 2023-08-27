package ru.geekbrains.oop.seminar1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramHomeWork {
    public static void main(String[] args) {
        Chips chips1 = new Chips("PotatoChips", "Lays", 199.90, 0.3, "Crab");
        Chips chips2 = new Chips("PotatoChips", "Lays",  149.90, 0.2,"Bacon");

        HotDrink hotDrink1 = new HotDrink("Tea","Lipton", 199.90,0.4,84.0 );
        HotDrink hotDrink2 = new HotDrink("Coffee","Jardin", 349.90,0.3,90.0 );

        List<Product> products = new ArrayList<>();
        products.add(chips1);
        products.add(chips2);
        products.add(hotDrink1);
        products.add(hotDrink2);

        VendingMachine vendingMachine = new VendingMachine(products);
        HotDrink hotDrink = vendingMachine.getHotDrink("Tea",0.4,84.0);
        if (hotDrink != null){
            System.out.println("Вы купили:");
            System.out.println(hotDrink.displayInfo());
        }
        else
        {
            System.out.println("Такого горячего напитка нет.");
        }

        Chips chips = vendingMachine.getChips("PotatoChips", 0.3, "Crab");
        if (chips != null){
            System.out.println("Вы купили:");
            System.out.println(chips.displayInfo());
        }
        else
        {
            System.out.println("Таких чипсов нет.");
        }
    }
}
