package ru.geekbrains.seminar7.singleton;

public class Settings {
    private static Settings instance;

    public static Settings getInstance() {
        // пример ленивой инициализации
        if (instance == null){
            instance = new Settings();
            instance.param1 = "Инициализировать новый конструктор нельзя, тк они защищены модификатором видимости.";
            instance.param2 = 15;
            instance.param3 = true;
            // TODO: инициализация состояния объекта (полей) Settings
        }
        return instance;
    }

    private String param1;
    private int param2;
    private boolean param3;

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }

    private Settings(){
    }

    private Settings(String param1, int param2, boolean param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }
}
