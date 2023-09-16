package ru.geekbrains.seminar4.bank;

public class Person implements PersonalData{

    public String getFio() {
        return fio;
    }

    private final String fio;
    private final String inn;

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, fio);
    }
}
