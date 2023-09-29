package ru.geekbrains.seminar7.homework;

public class Program {
    public static void main(String[] args) {

        // Создаем Паблишера - Агенство
        Publisher jobAgency = new JobAgency();

        // Создаем компании
        Company google = new Company("Google",jobAgency);
        Company yandex = new Company("Yandex",jobAgency);
        Company geekBrains = new Company("GeekBrains",jobAgency);

        // Создаем студентов
        Student student1 = new Student("Andrew","Pavluchenko",Professions.Backend_Developer,80000,2);
        Student student2 = new Student("Pavel","Denisov",Professions.QA_Engineer,80000,3);
        Student student3 = new Student("Igor","Serofimov",Professions.Frontend_Developer,100000,2);
        Student student4 = new Student("Vasiliy","Utkin",Professions.QA_Engineer,70000,2);
        Student student5 = new Student("Nancy","Evdakimova",Professions.Product_Designer,70000,1);

        // Создаем рабочих
        Worker worker1 = new Worker("Petr","Ivanov",Professions.Backend_Developer,150000,5);
        Worker worker2 = new Worker("Alexandra","Ryabkina",Professions.Backend_Developer,180000,6);
        Worker worker3 = new Worker("Ivan","Sidorov",Professions.Frontend_Developer,150000,5);
        Worker worker4 = new Worker("Alexander","Ivanov",Professions.Frontend_Developer,100000,3);
        Worker worker5 = new Worker("Olga","Kondratyeva",Professions.Product_Designer,150000,5);

        // Создаем управленев
        Manager manager1 = new Manager("Klim","Solovyev",Professions.Product_Manager,150000,3);
        Manager manager2 = new Manager("Alexandra","Baranova",Professions.Product_Manager,180000,5);
        Manager manager3 = new Manager("Nikita","Cherepko",Professions.CEO,250000,8);
        Manager manager4 = new Manager("Julia","Ivanova",Professions.CTO,100000,3);
        Manager manager5 = new Manager("Stas","Petrushkin",Professions.CEO,150000,5);

        // Регистрируем искателей работы, как наблюдателей
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(student3);
        jobAgency.registerObserver(student4);
        jobAgency.registerObserver(student5);

        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);
        jobAgency.registerObserver(worker3);
        jobAgency.registerObserver(worker4);
        jobAgency.registerObserver(worker5);

        jobAgency.registerObserver(manager1);
        jobAgency.registerObserver(manager2);
        jobAgency.registerObserver(manager3);
        jobAgency.registerObserver(manager4);
        jobAgency.registerObserver(manager5);

        // Создаем вакансии от компаний и сразу рассылаем их наблюдателям
        google.createVacancy(75000,Professions.QA_Engineer,2);
        yandex.createVacancy(100000,Professions.Product_Designer,2);
        geekBrains.createVacancy(110000,Professions.CTO,3);
        google.createVacancy(160000,Professions.Backend_Developer,5);
        yandex.createVacancy(150000,Professions.Product_Manager,4);
        geekBrains.createVacancy(200000,Professions.CEO,5);
        google.createVacancy(120000,Professions.Product_Manager,4);
        yandex.createVacancy(250000,Professions.CEO,6);
        geekBrains.createVacancy(100000,Professions.Frontend_Developer,2);
        google.createVacancy(160000,Professions.Product_Manager,5);
        yandex.createVacancy(120000,Professions.Frontend_Developer,3);
        geekBrains.createVacancy(135000,Professions.Backend_Developer,3);
        google.createVacancy(80000,Professions.Frontend_Developer,2);
        yandex.createVacancy(120000,Professions.Backend_Developer,3);
        geekBrains.createVacancy(180000,Professions.Product_Manager,5);
        google.createVacancy(150000,Professions.CTO,3);
        geekBrains.createVacancy(140000,Professions.Product_Designer,4);  
        google.createVacancy(300000,Professions.CEO,7);
        geekBrains.createVacancy(90000,Professions.QA_Engineer,3);
    }
}
