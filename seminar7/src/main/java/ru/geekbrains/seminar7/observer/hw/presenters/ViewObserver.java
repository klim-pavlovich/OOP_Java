package ru.geekbrains.seminar7.observer.hw.presenters;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
import ru.geekbrains.seminar7.observer.hw.models.VacancyArrayList;

public interface ViewObserver {
    void sendOffer(Vacancy vacancy);
    void getNewVacancy(Vacancy newVacancy);
    void updateVacanciesUI();
}
