package ru.geekbrains.seminar7.observer.hw.presenters;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;

public interface Publisher{
    public void createVacancy(int salary, String specialization, int requiredExperienceYears);
}
