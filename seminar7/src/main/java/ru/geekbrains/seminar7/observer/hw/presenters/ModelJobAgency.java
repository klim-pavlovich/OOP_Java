package ru.geekbrains.seminar7.observer.hw.presenters;


import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
import ru.geekbrains.seminar7.observer.hw.models.VacancyArrayList;

public interface ModelJobAgency {
    VacancyArrayList<Vacancy> loadVacancies();
//    int getNewVacancy(Vacancy newVacancy);
//    int sendOffer(Vacancy vacancy);
}
