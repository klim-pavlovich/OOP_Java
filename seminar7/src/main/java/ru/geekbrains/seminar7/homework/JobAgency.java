package ru.geekbrains.seminar7.homework;


import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{
    private List<Observer> observers = new ArrayList<>();
    private VacancyArrayList allVacancies;

    public JobAgency() {
        this.allVacancies = new VacancyArrayList(100);
    }

//    public VacancyArrayList<Vacancy> loadVacancies() {
//        if (allVacancies == null){
//            allVacancies = new VacancyArrayList<>();
//            allVacancies.add(new Vacancy(250000, Professions.Backend_Developer,8));
//            allVacancies.add(new Vacancy(130000,Professions.Frontend_Developer,3));
//        }
//        return allVacancies;
//    }

    public void getNewVacancy(Vacancy newVacancy) {
            allVacancies.add(newVacancy);
            sendOffer(newVacancy);
    }

    public void sendOffer(Vacancy vacancy){
        for (Observer observer: observers){
            if(observer.getSpecialization().equals(vacancy.getSpecialization()) && observer.getExperience() >= vacancy.getRequiredExperienceYears()){
            observer.receiveOffer(vacancy);
        }
    }}

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
