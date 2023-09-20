package ru.geekbrains.seminar5.presenters;

import ru.geekbrains.seminar5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {
    void setObserver(ViewObserver observer);
    void showTables(Collection<Table> tables);

    void showReservationResultUI(int reservationNo);
    void showCancelReservationResultUI(int cancelReservationResult);
    void showChangeReservationResultUI(int changingReservationResult);
    }
