package ru.geekbrains.seminar6.ocp1;

public class SquareV2 implements ShapeV2{
    public SquareV2(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    private int side;
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
