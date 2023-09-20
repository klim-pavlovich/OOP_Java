package ru.geekbrains.seminar5.models;
import java.util.Calendar;
import java.util.Date;

public class Reservation {

    private static int counter = 100;
    private final int id;
    private Date date;
    private String name;


    {
        id = ++ counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Date setDate(int year, int month, int day, int hour, int minute){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.HOUR,hour);
        calendar.set(Calendar.MINUTE, minute);

        Date date = calendar.getTime();
        return date;
    }

    public String getName() {
        return name;
    }
}
