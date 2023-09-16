package ru.geekbrains.seminar4.bank;

public class Company implements PersonalData{
    private final String name;
    private final String inn;

    public Company(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn,name);
    }
}
