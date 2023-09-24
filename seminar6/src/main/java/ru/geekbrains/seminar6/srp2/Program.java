package ru.geekbrains.seminar6.srp2;

public class Program {
    /**
     * TODO: Переработать приложение в рамках дз,
     * соблюдая принцип SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        GeneratedOrderFromConsole orderFromConsole = new GeneratedOrderFromConsole();
        orderFromConsole.inputFromConsole();

        SavedOrder jsonSavedOrder = new SavedOrder(orderFromConsole,"json");
//        jsonSavedOrder.saveOrder();
        SavedOrder xmlSavedOrder = new SavedOrder(orderFromConsole, "xml");
    }
}
