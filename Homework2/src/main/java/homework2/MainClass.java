package homework2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Vasya", 10),
                new Cat("Stesha", 50),
                new Cat("Musya", 45),
                new Cat("Lusya", 15)
        };

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat: cats){
            if (plate.getFood()>=cat.getAppetite()){
                // создаем временную переменную, чтобы запомнить аппетит кота
                int temp = cat.getAppetite();
                cat.eat();
                plate.setFood(plate.getFood() - temp);
                cat.setAppetite(0);
                System.out.println("Котик покушал.");
                System.out.println(cat.isFool(cat.getAppetite()));
            }
            else{
                System.out.println("В тарелке недостаточно еды для котика. Пополни тарелку!");
                System.out.println(cat.isFool(cat.getAppetite()));
                System.out.println("Котикам не хватает еды, поэтому добавим еще 100 ед. корма.");
                plate.addFood(100);
                // проверяем текущее кол-во корма, после добавления
                System.out.println(plate.getFood());
            }
        }
    }
}