//package ru.geekbrains.seminar7.observer.hw.models;
//import ru.geekbrains.seminar7.observer.hw.presenters.ViewObserver;
//
//public class Manager extends JobSeeker implements ViewObserver {
//
//    public Manager(String name, String surName, String specialization, int salary, int experienceYears) {
//        super(name,surName,specialization,salary,experienceYears);
//    }
//
//    public Manager(String name, String surName, String specialization, int salary, int experienceYears, String backgroundDescription) {
//        super(name,surName,specialization,salary,experienceYears, backgroundDescription);
//    }
//    @Override
//    public boolean receiveOffer(Vacancy vacancy){
//        if (this.salary <= vacancy.getSalary()){
//        System.out.printf("Менеджер: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
//        this.salary = vacancy.getSalary();
//        return true;
//    }
//        else{
//        System.out.printf("Менеджер: %s: Я не готов работать за такую зп! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
//    }
//        return false;
//}
//}
