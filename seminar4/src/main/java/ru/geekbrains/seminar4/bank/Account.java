package ru.geekbrains.seminar4.bank;

// можем ограничить универсальный параметр
// только те типы, которые имплементируют PersonalData
public abstract class  Account <T extends PersonalData>{

    private final T data;
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("[%s] Доступный лимит: %.2f", data, amount);
    }
}
