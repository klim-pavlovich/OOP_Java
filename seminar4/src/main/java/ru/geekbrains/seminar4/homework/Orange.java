package ru.geekbrains.seminar4.homework;

public class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }
    @Override
    public String toString() {
        return String.format("Orange");
    }
}
