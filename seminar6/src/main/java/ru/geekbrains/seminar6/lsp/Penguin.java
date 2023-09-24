package ru.geekbrains.seminar6.lsp;

public class Penguin extends Bird{

    // Сделали так, что Пингвин не умеет летать
    public Penguin() {
        super(false,0);
    }

    @Override
    public void fly() {
        // System.out.println("Пингвин не умеет летать!");
        throw new RuntimeException("Пингвин не умеет летать!");
    }
}
