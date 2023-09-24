package ru.geekbrains.seminar6.isp;

public class CustomPaymentSerivce extends PaymentService implements WebMoneyPayable, CreditCardPayable{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Custom pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Custom pay by credit car %d\n", amount);
    }
}
