package task2;

import java.util.Random;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee{
    private int days;
    private int hours;

    @Override
    public double calculateSalary() {
        return finalSalary=salaryIndex*days*hours;
    }

    public Freelancer(String name, String surName, double salaryIndex, int days, int hours) {
        super(name, surName, salaryIndex);
        this.days=days;
        this.hours=hours;
    }

    public Freelancer(String name, String surName, int age, double salaryIndex, int days, int hours) {
        super(name, surName, age, salaryIndex);
        this.days=days;
        this.hours=hours;
    }

    @Override
    public String toString() {
        if (age != 0) {
            return String.format("%s %s; Возраст: %d; Фрилансер; Месячная зарплата (гибкая): %.2f", surName, name, age, calculateSalary());
        }
        else {
            return String.format("%s %s; Фрилансер; Месячная зарплата (гибкая): %.2f", surName, name, calculateSalary());
        }
    }

//    @Override
//    public String toString() {
//        return String.format("%s %s; %d,Фрилансер; Среднемесячная зарплата (гибкая, зависит от дней и часов): %.2f", surName, name, age, calculateSalary());
//    }
}
