package ru.geekbrains.seminar6.lsp;

/**
 * T
 */
public class Bird {

    public void fly(){
        System.out.printf("Птица летит со скоростью %d\n", flySpeed);
    }

    public Bird(){
    }

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public Bird(boolean canFly, int flySpeed) {
        this.canFly = canFly;
        this.flySpeed = flySpeed;
    }

    public boolean isCanFly() {
        return canFly;
    }

    protected boolean canFly = true;
    protected int flySpeed = 10;

    public int getFlySpeed() {
        return flySpeed;
    }
}
