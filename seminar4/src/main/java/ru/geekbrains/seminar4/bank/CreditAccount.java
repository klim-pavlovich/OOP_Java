package ru.geekbrains.seminar4.bank;

// две стратегии наследования обобщенных типов
// первая - чтобы уйти от обобщения к обычному типу,
// необходимо от обобщенного типа подставить конкретный тип
/* public class CreditAccount extends Account<Person>{
    public CreditAccount(Person data, double amount) {
        super(data, amount);
    }
}*/

// второй - пробросить обобщение
public class CreditAccount<T extends PersonalData> extends Account<T>{
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
