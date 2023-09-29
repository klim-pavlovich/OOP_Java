package ru.geekbrains.seminar7.observer.hw.views;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
import ru.geekbrains.seminar7.observer.hw.models.VacancyArrayList;
import ru.geekbrains.seminar7.observer.hw.presenters.ViewObserver;
import ru.geekbrains.seminar7.observer.hw.presenters.View;

public class JobAgencyView implements View {

    private ViewObserver observer;

    @Override
    public void registerObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void removeObserver(ViewObserver observer) {
        //
    }

    @Override
    public void showGetVacancyResultUI(int vacancyId) {
        if (vacancyId > 0){
            System.out.printf("Вакансия №%d успешно получена", vacancyId);
        }
        else {
            System.out.print("Не удалось получить вакансию. Повторите попытку позже.");
        }
    }

    @Override
    public void showSendVacancyResultUI(int vacancyId) {
        if (vacancyId > 0){
            System.out.printf("Вакансия №%d успешно направлена", vacancyId);
        }
        else {
            System.out.print("Не удалось отправить вакансию. Повторите попытку позже.");
        }
    }

    @Override
    public void showVacancies(VacancyArrayList<Vacancy> allVacancies) {
        for (Vacancy vacancy: allVacancies){
            System.out.printf("Вакансия №%d от компании: %s; Специальность: %s; ЗП: %d, Требуемый опыт (лет): %d", vacancy.getId(),vacancy.getFromCompany(),vacancy.getSpecialization(), vacancy.getSalary(),vacancy.getRequiredExperienceYears());
        }
    }


}
