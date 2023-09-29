package ru.geekbrains.seminar7.observer.hw.models;

import ru.geekbrains.seminar7.observer.hw.presenters.ModelJobAgency;
import ru.geekbrains.seminar7.observer.hw.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements ModelJobAgency {

    private List<ViewObserver> observers = new ArrayList<>();
    private VacancyArrayList<Vacancy> allVacancies;



    @Override
    public VacancyArrayList<Vacancy> loadVacancies() {
        if(allVacancies == null){
           allVacancies = new VacancyArrayList<>();
            Vacancy  = new Vacancy(999999, Vacances.Backend_Developer,5);

        }
    }

//    @Override
//    public int getNewVacancy(Vacancy newVacancy) {
//        return 0;
//    }
//
//    @Override
//    public int sendOffer(Vacancy vacancy) {
//        return 0;
//    }


}
