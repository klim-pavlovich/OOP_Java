package ru.geekbrains.seminar5.views;

import ru.geekbrains.seminar5.models.Table;
import ru.geekbrains.seminar5.presenters.View;
import ru.geekbrains.seminar5.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationResultUI(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        } else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showCancelReservationResultUI(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Бронь успешно отменена: #%d\n", reservationNo);
        }
        if (reservationNo == -1){
            System.out.println("Бронь принадлежит другому клиенту. Возможно, вы ввели неверно имя. Проверьте корректность данных и повторите попытку.");
        }
        if (reservationNo == -2){
            System.out.println("Вам принадлежит другой номер брони. Проверьте корректность введенных данных и повторите попытку.");
        }
        if (reservationNo < -2) {
            System.out.println("Не удалось отменить бронь. Повторите попытку позже.");
        }
    }


    @Override
    public void showChangeReservationResultUI(int reservationNo) {
        if (reservationNo > 0){
            // с красивым выводом даты как только не мучался, так и не осилил (пока что, вернусь еще к этому моменту)
            System.out.printf("Бронь успешно изменена. Новый номер брони: #%d. \n", reservationNo);
        }
        if (reservationNo == - 1){System.out.println("Не удалось изменить бронь. Проверьте корректность данных и повторите попытку.");
        }
        if (reservationNo == -2){
            System.out.println("Дата брони изменена. Номер вашей брони остался прежним.");}
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationDate   дата бронирования
     * @param tableNo           номер столика
     * @param name              имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        if (observer != null){
            observer.onReservationTable(reservationDate, tableNo, name);
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку отмены бронирования), отмена бронирования столика
     * @param reservationNo номер брони
     */
    public void cancelReservation(int reservationNo, String name){
        if (observer != null){
            observer.onCancelReservationTable(reservationNo,name);
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования), бронирование столика
     * @param reservationNo номер старой брони
     * @param year          год нового бронирования
     * @param month         месяц нового бронирования
     * @param day           день нового бронирования
     * @param hour          час нового бронирования
     * @param minute        минута нового бронирования
     * @param tableNo       номер столика
     * @param name          имя клиента
     */
    public void changeReservationTable(int reservationNo, int year, int month, int day, int hour, int minute, int tableNo, String name){
        if (observer != null){
            observer.onChangeReservationTable(reservationNo,year, month, day, hour, minute, tableNo, name);
        }
    }

}
