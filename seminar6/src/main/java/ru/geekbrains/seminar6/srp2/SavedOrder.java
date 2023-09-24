package ru.geekbrains.seminar6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SavedOrder implements JsonSavedService, XmlSavedService{
    private Order order;
    private String format;

    public String getFormat() {
        return format;
    }

    public SavedOrder(Order order, String format) {
        this.order = order;
        this.format = format;
        saveOrder();
    }

    public void saveOrder(){
        if (this.format == "json") {
            saveToJson(order);
        }
        if (this.format == "xml"){
            saveToXml(order);
        }
    }
    public void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + " \n");
            writer.write("}\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToXml(Order order){
        String fileName = "order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<order>\n");
            writer.write("\t<clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("\t<product>" + order.getProduct() + "</product>\n");
            writer.write("\t<qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("\t<price>" + order.getPrice() + "</price>\n");
            writer.write("</order>");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
