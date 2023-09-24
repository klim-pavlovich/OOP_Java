package ru.geekbrains.seminar6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order{

    //region Constructors
    public Order() {
    }
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    //endregion

    //region Public Methods
//    public void inputFromConsole(){
//        clientName = prompt("Client name: ");
//        product = prompt("Product: ");
//        qnt = Integer.parseInt(prompt("Quantity: "));
//        price = Integer.parseInt(prompt("Price: "));
//    }

//    public void saveToJson(){
//        String fileName = "order.json";
//        try (FileWriter writer = new FileWriter(fileName,false)){
//            writer.write("{\n");
//            writer.write("\"clientName\":\""+clientName+"\",\n");
//            writer.write("\"product\":\""+product+"\",\n");
//            writer.write("\"qnt\":"+qnt+",\n");
//            writer.write("\"price\":"+price+" \n");
//            writer.write("}\n");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
    //endregion

    //region Private Fields
    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;
    //endregion

    //region Public Getters and Setters (Properties)

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
    //endregion
}
