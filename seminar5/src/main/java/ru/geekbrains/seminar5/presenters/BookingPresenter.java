package ru.geekbrains.seminar5.presenters;

import ru.geekbrains.seminar5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    // пример реализации напрямую, без интерфейсов (как не надо делать!)
//    private final TableModel model;
//    private final BookingView view;
//
//    public BookingPresenter(TableModel model, BookingView view) {
//        this.model = model;
//        this.view = view;
//    }

    // SOLID (Dependency Inversion) - модули верзних уровней
    // не должны зависить от модулей нижних уровней напрямую
    // зависимость должна выстраиваться на основе абстракции
    // детали реализации должны подстраиваться под деталии абстракции, а не наоборот
    // (отсылка к примеру с разетками и электроприбором)
    // Все компоненты должны подстраиваться под единые интерфейсы (Model Interface, View Interface)


    // кпример реализации через интерфейсы (как надо)
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this); // BookingPresetner наблюдает за представлением
    }

    /**
     * Получить список всех столиков
     */
    public Collection<Table> loadTables(){
        return model.loadTables();
    }

    public void updateTablesUI(){
        view.showTables(loadTables());
    }

    public void updateReservationResultUI(int reservationNo){
        view.showReservationResultUI(reservationNo);
    }

    public void updateCancelReservationResultUI(int reservationNo){
        view.showCancelReservationResultUI(reservationNo);
    }

    public void updateChangeReservationResultUI(int changingReservationResult){
        view.showChangeReservationResultUI(changingReservationResult);
    }


    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservationDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }

    @Override
    public void onCancelReservationTable(int reservationNo, String name) {
        int reservationId = model.cancelReservation(reservationNo, name);
        updateCancelReservationResultUI(reservationId);
    }

    @Override
    public void onChangeReservationTable(int reservationNo, int year, int month, int day, int hour, int minute, int tableNo, String name) {
        int changingReservationResult = model.changeReservationTable(reservationNo, year, month, day, hour, minute, tableNo, name);
        updateChangeReservationResultUI(changingReservationResult);
    }
}
