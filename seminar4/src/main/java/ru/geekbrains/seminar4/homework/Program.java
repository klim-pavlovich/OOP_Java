package ru.geekbrains.seminar4.homework;

/*      a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.*/

public class Program {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox = new Box<Apple>(new Apple[10]);
        Box<Orange> orangeBox = new Box<Orange>(new Orange[10]);
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);

        for (Apple apple: appleBox){
            if(apple!=null){
                System.out.printf("Яблоко: %s\n", apple);
            }
        }

        for (Orange orange : orangeBox){
            if(orange!=null){
                System.out.printf("Апельсин: %s\n", orange);
            }
        }

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        boolean resultOfComparing = appleBox.compare(orangeBox);
        interpretationOfComparison(resultOfComparing);

        Box<Apple> appleBoxToBePoured = new Box(new Apple[10]);
        Box<Orange> orangeBoxToBePoured = new Box(new Orange[10]);

        System.out.println("\n");
        appleBox.pourFruits(appleBoxToBePoured);
        System.out.println(appleBox);
        System.out.println(appleBoxToBePoured);
        System.out.println("\n");
        orangeBox.pourFruits(orangeBoxToBePoured);
        System.out.println(orangeBox);
        System.out.println(orangeBoxToBePoured);
        // Демонстрация того, что нельзя перемешивать коробки
//        appleBoxToBePoured.pourFruits(orangeBoxToBePoured);

    }
    public static void interpretationOfComparison(boolean answer){
        if (answer){
            System.out.println("Веса коробок равны.");
        }
        else{
            System.out.println("Веса коробок различны.");
        }
}}
