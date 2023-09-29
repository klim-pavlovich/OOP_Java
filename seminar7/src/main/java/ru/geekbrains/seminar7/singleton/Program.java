package ru.geekbrains.seminar7.singleton;

public class Program {
    public static void main(String[] args) {

        // пример ленивой инициализации
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

//        Settings settings3 = new Settings();
    }
}
