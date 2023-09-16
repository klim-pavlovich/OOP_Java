package ru.geekbrains.seminar4.homework;

public abstract class Fruit {
    public final float weight;


    protected Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

}
