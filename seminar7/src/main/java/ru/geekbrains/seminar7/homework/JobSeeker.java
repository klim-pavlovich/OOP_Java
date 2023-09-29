package ru.geekbrains.seminar7.homework;


public abstract class JobSeeker{

    //region Protected Fields
    protected String name;
    protected String surName;
    protected Professions specialization;
    protected int experienceYears;
    protected int salary;
    protected String backgroundDescription;
    //endregion
    protected boolean receiveOffer(Vacancy vacancy){
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Искатель работы: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
            this.salary = vacancy.getSalary();
            return true;
        }
        else{
            System.out.printf("Искатель работы: %s: Я не готов работать за такую зп! (Компания: %s; Заработная плата: %d)\n",name,vacancy.getFromCompany().getBrandName(),salary);
        }
        return false;
    }

    //region Protected Constructors
    protected JobSeeker(String name, String surName, Professions specialization, int salary, int experienceYears) {
        this.setName(name);
        this.setSurName(surName);
        this.setSpecialization(specialization);
        this.setSalary(salary);
        this.setExperienceYears(experienceYears);
    }
    protected JobSeeker(String name, String surName, Professions specialization, int salary, int experienceYears, String backgroundDescription) {
        this.setName(name);
        this.setSurName(surName);
        this.setSpecialization(specialization);
        this.setSalary(salary);
        this.setExperienceYears(experienceYears);
        this.setBackgroundDescription(backgroundDescription);
    }
    //endregion

    //region Protected Getters And Setters
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurName() {
        return surName;
    }

    protected void setSurName(String surName) {
        this.surName = surName;
    }

    protected Professions getSpecialization() {
        return specialization;
    }

    protected void setSpecialization(Professions specialization) {
        this.specialization = specialization;
    }

    protected int getExperienceYears() {
        return experienceYears;
    }

    protected void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    protected int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    protected String getBackgroundDescription() {
        return backgroundDescription;
    }

    protected void setBackgroundDescription(String backgroundDescription) {
        this.backgroundDescription = backgroundDescription;
    }
    //endregion
}
