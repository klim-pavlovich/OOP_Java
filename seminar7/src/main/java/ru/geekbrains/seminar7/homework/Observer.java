package ru.geekbrains.seminar7.homework;

public interface Observer {
    boolean receiveOffer(Vacancy vacancy);
    Professions getSpecialization();
    int getSalary();
    int getExperience();
}
