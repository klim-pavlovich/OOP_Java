package ru.geekbrains.seminar7.builder;

public class Program {
    public static void main(String[] args) {

        // Builder например используется в StringBuilder
        StringBuilder stringBuilder = new StringBuilder("AAA");
        stringBuilder
                .append("BBB")
                .append("CCC")
                .insert(2,"ddd")
                .append("GGG")
                .toString();

        // пример текучего интерфейса
        Order order = new OrderBuilder()
                .setProductId(100111)
                .setClientName("Peter")
                .setQnt(2)
                .setSign(true)
                .setProductName("Snickers")
                .setPrice(200)
                .build();
    }
}
