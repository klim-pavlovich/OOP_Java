package ru.geekbrains.seminar5.models;

import ru.geekbrains.seminar5.presenters.Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;


    /**
     * Получить список столиков
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Броинрование столика
     *
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиента
     * @return номер резерва
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table t : tables) {
            if (t.getNo() == tableNo) {
                for (Reservation reservation : t.getReservations()) {
                    if (reservation.getDate().equals(reservationDate)) {
                        return -2; // Столик уже занят на данную дату
                    }}
                Reservation newReservation = new Reservation(reservationDate, name);
                t.getReservations().add(newReservation);
                return newReservation.getId();
                        }

            }
        return -1; // Не удалось забронировать столик
        }

    public int cancelReservation(int reservationNo, String name){
        for (Table table: tables){
            for (Reservation reservation: table.getReservations()){
                if (reservation.getId() == reservationNo && reservation.getName().equals(name)){
                    table.getReservations().remove(reservation);
                    return reservation.getId();
                }
                if (reservation.getId() == reservationNo){
                    return -1; // Не удалось отменить бронь, тк имя пользователя не совпадает
                }
                if (reservation.getName() == name){
                    return -2; // Не удалось отменить бронь, тк пользователь перепутал номер брони
                }
            }
        }
        return -3; // Не удалось отменить бронь по непонятным причинам
    }


    /**
     *
     * @param OldreservationNo    номер старой брони
     * @param year                  год новой брони
     * @param month                 месяц новой брони
     * @param day                   день новой брони
     * @param hour                  час новой брони
     * @param minute                минута новой брони
     * @param tableNo               номер стола для новой брони
     * @return                      номер брони
     */
    public int changeReservationTable(int OldreservationNo, int year, int month, int day, int hour, int minute, int tableNo, String name) {
        for (Table table : tables){
                for (Reservation reservation: table.getReservations()) {
                    if (reservation.getId() == OldreservationNo && table.getNo() == tableNo) {
                        reservation.setDate(year, month, day, hour, minute);
                        return -2;// изменена только дата
                    }
                    // нужно как то сменить бронь на другой стол,
                    // тк у нас привязка бронь к столу, а не стол к брони
                    // придется удалять старую бронь и создавать новую бронь
                    // с привязкой к другому столу
                }}

        for (Table table : tables){
            for (Reservation reservation: table.getReservations()){
                if (reservation.getId() == OldreservationNo){
                        String userName = reservation.getName();
                        // удаляем старую бронь
                        table.getReservations().remove(reservation);
                        // создаем новую, с новой датой
                        Date newDateReservation = new Date(year, month, day, hour, minute);
                        Reservation newReservation = new Reservation(newDateReservation, userName);
                        return newReservation.getId();
                    }
                }}

        return -1;// Не удалось изменить бронь
        }
}

