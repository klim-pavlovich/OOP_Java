package ru.geekbrains.seminar7.homework;

public class Manager extends JobSeeker implements Observer{

    public Manager(String name, String surName, Professions specialization, int salary, int experienceYears) {
        super(name,surName,specialization,salary,experienceYears);
    }

    public Manager(String name, String surName, Professions specialization, int salary, int experienceYears, String backgroundDescription) {
        super(name,surName,specialization,salary,experienceYears, backgroundDescription);
    }
    @Override
    public boolean receiveOffer(Vacancy vacancy){
        if (this.salary <= vacancy.getSalary()){
        System.out.printf("Менеджер: %s %s. Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",name,surName,vacancy.getFromCompany().getBrandName(),salary);
        this.salary = vacancy.getSalary();
        return true;
    }
        else{
        System.out.printf("Менеджер: %s %s. Я не готов работать за такую зп! (Компания: %s; Заработная плата: %d)\n",name,surName,vacancy.getFromCompany().getBrandName(),salary);
    }
        return false;
}

    @Override
    public Professions getSpecialization() {
        return specialization;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getExperience() {
        return experienceYears;
    }
}
