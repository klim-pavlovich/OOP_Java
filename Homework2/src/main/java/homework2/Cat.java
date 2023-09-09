package homework2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isFool(int appetite){
        if (this.appetite ==0){
            return satiety;
        }
        else{
            return !satiety;
        }
    }

//    public String isFoolToConsole(boolean isFool){
//        System.out.printf(isFool);
//    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat() {
        setAppetite(0);
    }
}