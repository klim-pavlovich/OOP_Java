package ru.geekbrains.seminar7.observer.hw.models;

public class Vacancy {
    private static int id = 100;
    private int salary;
    private Vacances specialization;
    private int requiredExperienceYears;
    private boolean status;

    private Company fromCompany;

    public Company getFromCompany() {
        return fromCompany;
    }

    public void setFromCompany(Company fromCompany) {
        this.fromCompany = fromCompany;
    }

    {
        id++;
        System.out.printf("Создана вакансия №%d",id);
    }

    public Vacancy(int salary, Vacances specialization, int requiredExperienceYears){
        this.salary = salary;
        this.specialization = specialization;
        this.requiredExperienceYears = requiredExperienceYears;
        this.status = true;
        id=getId();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Вакансия №%d, специальность: %s, зп: %d, требуемый стаж: %d",id,specialization,salary,requiredExperienceYears);
    }

    public int getSalary() {
        return salary;
    }

    public Vacances getSpecialization() {
        return specialization;
    }

    public int getRequiredExperienceYears() {
        return requiredExperienceYears;
    }
}
