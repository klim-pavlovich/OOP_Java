package ru.geekbrains.seminar7.homework;

import ru.geekbrains.seminar7.homework.Company;
import ru.geekbrains.seminar7.homework.Professions;

public class Vacancy {
    private static int id = 100;
    private int salary;
    private Professions specialization;
    private int requiredExperienceYears;
    private boolean status;

    private Company fromCompany;

    public Company getFromCompany() {
        return fromCompany;
    }

    public void sentFromCompany(Company fromCompany) {
        this.fromCompany = fromCompany;
    }

    {
        id++;
        System.out.printf("Создана вакансия №%d\n",id);
    }

    public Vacancy(int salary, Professions specialization, int requiredExperienceYears){
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

    public Professions getSpecialization() {
        return specialization;
    }

    public int getRequiredExperienceYears() {
        return requiredExperienceYears;
    }
}
