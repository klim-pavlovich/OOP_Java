package ru.geekbrains.seminar7.observer.hw.models;

import ru.geekbrains.seminar7.observer.hw.presenters.Model;
import ru.geekbrains.seminar7.observer.hw.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.List;

public class JobAgencyModel implements Model {

    private List<ViewObserver> observers = new ArrayList<>();
    private VacancyArrayList<Vacancy> allVacancies;
    private JobSickerArrayList<JobSicker> allJobSickers;

    @Override
    public VacancyArrayList<Vacancy> loadVacancies() {
        if (allVacancies == null){
            allVacancies = new VacancyArrayList<>();
            allVacancies.add(new Vacancy(250000,Professions.Backend_Developer,8));
            allVacancies.add(new Vacancy(130000,Professions.Frontend_Developer,3));
        }
        return allVacancies;
    }

    @Override
    public int getNewVacancy(Vacancy newVacancy) {
        if(newVacancy.getId()>0){
            allVacancies.add(newVacancy);
            return newVacancy.getId();
        }
        else{
            return -1; // ошибка формирования вакансии
        }
    }

    @Override
    public int sendOffer(Vacancy vacancy) {
        if(vacancy.getId()>0){
            for (JobSicker jobSicker: allJobSickers) {
                jobSicker.receiveOffer(vacancy);
            }
        }
        else{
            return -1; // ошибка формирования вакансии
        }
        return -1;
    }


}
