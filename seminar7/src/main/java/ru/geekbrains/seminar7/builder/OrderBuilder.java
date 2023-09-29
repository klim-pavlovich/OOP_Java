package ru.geekbrains.seminar7.builder;

public class OrderBuilder {

    private Order order;

    public OrderBuilder(){
        order = new Order();
    }

    // Метод для возврата
    public Order build(){

        if (order.getProductId() <= 1000){
            throw new RuntimeException("Идентификатор продукта указан некорректно!");
        }

        // добавляем проверки для сохранения бизнес логики
        if (order.getQnt() <= 0)
            throw new RuntimeException("Кол-во позиций товара указано некорректно!");

        if (order.getPrice() <= 0)
            throw new RuntimeException("Цена товара указана некорректно!");

        return order;
    }

    // Тк ссылка на сам объект, можно использовать this
    public OrderBuilder setClientName(String clientName){
        order.setClientName(clientName);
        return this;
    }

    public OrderBuilder setCompanyName(String companyName){
        order.setCompanyName(companyName);
        return this;
    }

    public OrderBuilder setProductId(int productId){
        order.setProductId(productId);
        return this;
    }

    public OrderBuilder setProductName(String productName){
        order.setProductName(productName);
        return this;
    }

    public OrderBuilder setQnt(int qnt){
        order.setQnt(qnt);
        return this;
    }

    public OrderBuilder setPrice(double price){
        order.setPrice(price);
        return this;
    }

    public OrderBuilder setSign(boolean sign){
        order.setSign(sign);
        return this;
    }
}
