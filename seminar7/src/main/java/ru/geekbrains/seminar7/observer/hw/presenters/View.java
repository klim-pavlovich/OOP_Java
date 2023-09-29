package ru.geekbrains.seminar7.observer.hw.presenters;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
import ru.geekbrains.seminar7.observer.hw.models.VacancyArrayList;

public interface View {
    void registerObserver(ViewObserver observer);
    void removeObserver(ViewObserver observer);

    void showSendVacancyResultUI(int vacancyId);
    void showVacancies(VacancyArrayList<Vacancy> allVacancies);
}
