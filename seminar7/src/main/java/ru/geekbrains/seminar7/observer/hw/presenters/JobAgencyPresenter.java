package ru.geekbrains.seminar7.observer.hw.presenters;

import ru.geekbrains.seminar7.observer.hw.models.Vacancy;

public class JobAgencyPresenter implements ViewObserver{
    private ModelJobAgency model;
    private View view;
    public JobAgencyPresenter(ModelJobAgency model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    @Override
    public void getNewVacancy(Vacancy newVacancy) {
        int vacancyNo = model.getNewVacancy()
    }

    @Override
    public void sendOffer(Vacancy vacancy) {

    }
}
