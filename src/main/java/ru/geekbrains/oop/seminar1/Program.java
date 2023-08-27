package ru.geekbrains.oop.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("ProductName1", "ProductBrand", 200);
        System.out.println(product1.displayInfo());

//        Product product2 = new Product("ProductName2", "ProductBrand", -200);
//        System.out.println(product2.displayInfo());

        Product product3 = new Product("ProductName3", "ProductBrand", 100);
        System.out.println(product3.displayInfo());

//        Product product4 = new Product();
//        product4.setName("Коммутатор");
//        System.out.println(product4.getName());

        BottleOfWater bottleOfWater1 =  new BottleOfWater("Вода1", "ООО Источник", 250, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 =  new BottleOfMilk("Молоко1", "ООО Простаквашино", 250, 1.0, 5);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater2 =  new BottleOfWater("Вода2", "ООО Источник", 250, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk2 =  new BottleOfMilk("Молоко2", "ООО Простаквашино", 250, 1.0, 5);
        System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода1",1.5);
        if (bottleOfWater != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWater.displayInfo());
        }
        else{
            System.out.println("Такой бутылки с водой в автомате нет.");
        }
    }
}
