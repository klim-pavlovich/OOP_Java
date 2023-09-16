package ru.geekbrains.seminar4.bank;

public class Program {
    public static void main(String[] args) {

        Person person = new Person("FIO1","20302300");
        Company company = new Company("BrandName","11111123");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person,30.12);
        DebetAccount<Company> debetAccount1 = new DebetAccount<>(company,200000000);

        Transaction<Account> transaction1 = new Transaction<>(debetAccount1,creditAccount1,25000);
        transaction1.execute();
        transaction1.execute();


        // ДЗ. Используем обобщение
        //
    }
}
