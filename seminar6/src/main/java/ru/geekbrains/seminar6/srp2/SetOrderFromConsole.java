package ru.geekbrains.seminar6.srp2;

import java.util.Scanner;

public class SetOrderFromConsole extends Order {
    //region Private Methods
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    //endregion

    public void inputFromConsole() {
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    public SetOrderFromConsole() {
        super();
    }
}
