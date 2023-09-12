package task2;

import java.util.Random;

/**
 * Работник с постоянной ставкой за месяц
 */
public class Worker extends Employee{


    public Worker(String surName, String name, double salaryIndex) {
        super(surName, name, salaryIndex);
    }
    public Worker(String surName, String name, int age, double salaryIndex) {
        super(surName, name, age, salaryIndex);
    }

    @Override
    public double calculateSalary() {
        return finalSalary=salaryIndex*100;
    }

    @Override
    public String toString() {
        if (age != 0) {
            return String.format("%s %s; Возраст: %d; Работник; Среднемесячная зарплата (фиксированная): %.2f", surName, name, age, calculateSalary());
        }
        else {
            return String.format("%s %s; Работник; Среднемесячная зарплата (фиксированная): %.2f", surName, name, calculateSalary());
        }
}}
