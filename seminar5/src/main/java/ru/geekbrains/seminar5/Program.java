package ru.geekbrains.seminar5;


import ru.geekbrains.seminar5.models.TableModel;
import ru.geekbrains.seminar5.presenters.BookingPresenter;
import ru.geekbrains.seminar5.views.BookingView;

import java.util.Date;

/* Архитектурный шаблон проектирования (паттерн) - стиль разработки приложения, организация работы
    Controller - объект такого класса способен обработать запрос с веб-сервера.
    MVP - изолированный подход, в MVC View может обращаться к Models для того, чтобы
    получать актуальный список данных (напр. механизм - budding), в MVP всё взаимодействие Models и View
    происходит через Presenter.
    в MVC - запись данных через Controller, но сбор актуальных данных напрямую
    Данные паттерны позволяют делать приложение масштабируемым и гибким, вносить минимум изменений,
    только в определенном компоненте.
    в MVP - компоненты более независимы, может изменять только View, чтобы изменить отображение
    (напр. с мобильной версии в декстопную). Presenter может не только записывать, но и считывать данные.

*/
public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateTablesUI();
        System.out.println();

        Date date1 = new Date(2023,10,1,16,30);



        view.reservationTable(date1, 1,"Станислав");
        view.reservationTable(date1, 2,"Олег");
        view.reservationTable(date1, 3,"Ярослав");
        System.out.println();

        System.out.println("Примеры отмены брони и обработки разных ошибок:");
        // Пример отмены брони
        view.cancelReservation(101, "Станислав");


        // Пример обработки ошибки отмены брони,
        // если бронь принадлежит другому пользователю (не совпадает имя клиента)
        view.cancelReservation(102, "Кирилл");
        // Пример обработки ошибки отмены брони,
        // если клиент перепутал номер брони
        view.cancelReservation(999, "Олег");


        System.out.println();
        System.out.println("Примеры изменения брони:");
        // Пример изменения времени брони
        view.changeReservationTable(102, 2023,10,1,17,45, 2, "Олег");
        // Пример изменения времени брони и столика
        view.changeReservationTable(102, 2023,10,1,18,00, 3, "Олег");
        // Пример изменения столика брони
        view.changeReservationTable(103, 2023,10,1,16,30, 5, "Ярослав");

        System.out.println();
        System.out.println("Пример обработки пользовательской ошибки при изменении брони:");
        // Пример отказа в изменении брони (тк бронь уже удалена)
        view.changeReservationTable(101, 2023,10,1,17,45, 1, "Станислав");

    }
}
