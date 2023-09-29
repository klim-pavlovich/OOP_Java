package ru.geekbrains.seminar7.homework;

import java.util.Random;

public class Company {
    private Random random = new Random();
    private final String brandName;
    private Publisher jobAgency;

    public String getBrandName() {
        return brandName;
    }

    public Company(String brandName, Publisher jobAgency) {
        this.brandName = brandName;
        this.jobAgency = jobAgency;
    }

    public void createVacancy(int salary, Professions specialization, int requiredExperienceYears){
        Vacancy newVacancy = new Vacancy(salary,specialization,requiredExperienceYears);
        newVacancy.sentFromCompany(this);
        jobAgency.getNewVacancy(newVacancy);
    }
}

