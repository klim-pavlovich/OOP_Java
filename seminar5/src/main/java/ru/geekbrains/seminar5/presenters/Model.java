package ru.geekbrains.seminar5.presenters;

import ru.geekbrains.seminar5.models.Table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);
    // допустим, для отмены брони достаточно номера брони и имя клиента
    int cancelReservation(int reservationNo, String name);
    int changeReservationTable(int OldreservationNo, int year, int month, int day, int hour, int minute, int tableNo, String name);
}
