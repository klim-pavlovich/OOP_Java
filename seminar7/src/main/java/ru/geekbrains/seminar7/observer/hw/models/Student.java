//package ru.geekbrains.seminar7.observer.hw.models;
//import ru.geekbrains.seminar7.observer.hw.presenters.ViewObserver;
//
//public class Student extends JobSeeker implements ViewObserver {
//
//    public Student(String name, String surName, String specialization, int salary, int experienceYears) {
//        super(name,surName,specialization,salary,experienceYears);
//    }
//    public Student(String name, String surName, String specialization, int salary, int experienceYears, String backgroundDescription) {
//        super(name,surName,specialization,salary,experienceYears, backgroundDescription);
//    }
//    @Override
//    public boolean receiveOffer(Vacancy vacancy) {
//        if (this.salary <= vacancy.getSalary() ){
//            System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
//            this.salary=vacancy.getSalary();
//            return true;
//        }
//        else{
//            System.out.printf("Студент: %s: Я не готов работать за такую зп! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
//        }
//        return false;
//    }
//}
