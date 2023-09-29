package ru.geekbrains.seminar7.observer.hw.models;

public abstract class JobSicker {
    //region Protected Fields
    protected String name;
    protected String surName;
    protected String specialization;
    protected int experienceYears;
    protected int salary;
    protected String backgroundDescription;
    public boolean receiveOffer(Vacancy vacancy){
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
    //endregion

    //region Constructors
    JobSicker(String name, String surName, String specialization, int salary, int experienceYears) {
        this.setName(name);
        this.setSurName(surName);
        this.setSpecialization(specialization);
        this.setSalary(salary);
        this.setExperienceYears(experienceYears);
    }
    JobSicker(String name, String surName, String specialization, int salary, int experienceYears, String backgroundDescription) {
        this.setName(name);
        this.setSurName(surName);
        this.setSpecialization(specialization);
        this.setSalary(salary);
        this.setExperienceYears(experienceYears);
        this.setBackgroundDescription(backgroundDescription);
    }
    //endregion

    //region Public Getters And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBackgroundDescription() {
        return backgroundDescription;
    }

    public void setBackgroundDescription(String backgroundDescription) {
        this.backgroundDescription = backgroundDescription;
    }
    //endregion
}
