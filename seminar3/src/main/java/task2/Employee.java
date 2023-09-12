package task2;

import java.util.Random;


/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee>{
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Возраст
     */
    protected int age;
    /**
     * Ставка заработной платы
     */
    protected double salaryIndex;
    /**
     * Итоговая зарплата
     */
    protected double finalSalary;

    public Employee(String surName, String name) {
        this.name = name;
        this.surName = surName;
    }

    public abstract double calculateSalary();

    public Employee(String surName, String name, double salaryIndex) {
        this.name = name;
        this.surName = surName;
        this.salaryIndex = salaryIndex;
    }
    public Employee(String surName, String name, int age, double salaryIndex) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salaryIndex = salaryIndex;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName,name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0){
            name.compareTo(o.name);
        }
        return res;
    }
}
