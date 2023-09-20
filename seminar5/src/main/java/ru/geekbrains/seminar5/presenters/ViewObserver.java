package ru.geekbrains.seminar5.presenters;

import java.util.Date;

// интерфейс для наблюдателя (шаблон проектирования Observer)
public interface ViewObserver {
    void onReservationTable(Date reservationDate, int tableNo, String name);
    void onCancelReservationTable(int reservationNo, String name);
    void onChangeReservationTable(int reservationNo, int year, int month, int day, int hour, int minute, int tableNo, String name);
}
