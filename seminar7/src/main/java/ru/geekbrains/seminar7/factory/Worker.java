package ru.geekbrains.seminar7.factory;

// рабочий на полную ставку
public class Worker extends Employee{
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная зп (фиксированная): %.2f", name, surName, salary);
    }
}
