package ru.geekbrains.seminar7.homework;

public interface Publisher {
    void sendOffer(Vacancy vacancy);
    void getNewVacancy(Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
}
