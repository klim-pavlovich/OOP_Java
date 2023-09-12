package task2;

public class Trainee extends Employee{
    public double reward;

    public Trainee(String surName, String name, double reward) {
        super(surName, name);
        this.reward=reward;
    }

    public Trainee(String surName, String name, int age, double reward) {
        super(surName, name);
        this.age=age;
        this.reward=reward;
    }

    @Override
    public double calculateSalary() {
        return reward;
    }
    @Override
    public String toString() {
        if (age != 0) {
            return String.format("%s %s; Возраст: %d; Стажер; Вознаграждение: %.2f", surName, name, age, calculateSalary());
        }
        else {
            return String.format("%s %s; Стажер; Вознаграждение: %.2f", surName, name, calculateSalary());
        }
    }
}
