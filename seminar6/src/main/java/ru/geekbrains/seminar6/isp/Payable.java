package ru.geekbrains.seminar6.isp;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);

}
