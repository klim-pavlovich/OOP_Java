package ru.geekbrains.seminar7.observer.hw.models;
import ru.geekbrains.seminar7.observer.hw.presenters.Model;
import ru.geekbrains.seminar7.observer.hw.presenters.Publisher;

import java.util.Random;

public class Company implements Publisher {
    private Random random = new Random();
    private String brandName;
    private Model jobAgency;

    public String getBrandName() {
        return brandName;
    }

    public Company(String brandName, Model jobAgency) {
        this.brandName = brandName;
        this.jobAgency = jobAgency;
    }

    @Override
    public void createVacancy(int salary, Professions specialization, int requiredExperienceYears){
        Vacancy newVacancy = new Vacancy(salary,specialization,requiredExperienceYears);
        newVacancy.setFromCompany(this);
        jobAgency.getNewVacancy(newVacancy);
    }

}
