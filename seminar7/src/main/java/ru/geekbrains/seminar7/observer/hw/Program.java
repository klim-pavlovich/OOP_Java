//package ru.geekbrains.seminar7.observer.hw;
//
//import ru.geekbrains.seminar7.observer.hw.models.Company;
//import ru.geekbrains.seminar7.observer.hw.models.JobAgency;
//import ru.geekbrains.seminar7.observer.hw.models.Student;
//import ru.geekbrains.seminar7.observer.hw.models.Worker;
//import ru.geekbrains.seminar7.observer.hw.views.Publisher;
//
//public class Program {
//    /**
//     * TODO: Доработать приложение, которое разрабтывалось на семинаре, поработать с шаблоном проектирования Observer,
//     * добавить новый тип соискателя (можно несколько).
//     * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
//     * Только после этого можно усложнить приложение при желании, например,
//     * добавив тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
//     * P.S. можно добавить механизм ухода из кадрового агенства, например, ответить на оффер булевским значением;
//     * можно добавить анализ результатов, если кто-то согласился - другим не рассылать
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//
//        JobAgency jobAgency = new JobAgency();
//        Company google = new Company("Google", jobAgency, 120000);
//        Company yandex = new Company("Yandex", jobAgency, 90000);
//        Company geekBrains = new Company("GeekBrains", jobAgency, 95000);
//
//        Student student1 = new Student("student1");
//        Worker worker1 = new Worker("Worker1");
//        Worker worker2 = new Worker("Worker2");
//
//        jobAgency.resigterObserver(student1);
//        jobAgency.resigterObserver(worker1);
//        jobAgency.resigterObserver(worker2);
//
//        for (int i = 0; i < 3; i++){
//            google.needEmployee();
//            yandex.needEmployee();
//            geekBrains.needEmployee();
//        }
//
//    }
//}
