package ru.geekbrains.seminar7.factory;

import java.util.Random;

public class Program {

    // Определяем типы сотрудников
    // формируем класс enum (EmployeeType)

    static Random random = new Random();
    static Employee generateEmployee(EmployeeType employeeType){
        String[] names = new String[]{"Анатолий", "Глеб", "Андрей", "Влад", "Сергей"};
        String[] surNames = new String[] {"Григорьев", "Бойченко", "Иванов", "Шестаков", "Сидоров"};
        int typeIndex = random.nextInt(2);
        int salary = random.nextInt(200,500);
        int index = random.nextInt(100,150);
        return switch (employeeType)
        {
            case Freelancer -> new Freelancer(names[random.nextInt(5)], surNames[random.nextInt(5)],salary);
            case Worker -> new Worker(names[random.nextInt(5)], surNames[random.nextInt(5)],salary * index);
        };
    }
    public static void main(String[] args) {

    }
}
