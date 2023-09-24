package ru.geekbrains.seminar6.ocp1;

public class Square implements Shape{
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    private int side;


}
