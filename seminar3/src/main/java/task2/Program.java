package task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(String type){
        String[] names = new String[]{"Анатолий","Глеб", "Клим", "Мартин", "Лазарь", "Владен", "Клим", "Пакнратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов","Шубин","Бирюков","Копылов","Лыткин","Соколов"};

        int salaryIndex = random.nextInt(500, 900);
        int volumeOfHours = random.nextInt(1,8);
        int volumeOfDays = random.nextInt(1,22);
        int age = random.nextInt(18,65);
        double reward = random.nextDouble(5000.00,10000.00);

        if(type == "worker"){
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salaryIndex){};
        }
        else if (type == "freelancer") {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salaryIndex, volumeOfDays, volumeOfHours){};
        }
        else //(type == "trainee"){
            return new Trainee(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, reward);

    }

    public static Employee[] generateEmployees(int counter){
        int counterOfTrainees = 3;
        int counterOfFreelancers = random.nextInt(1,counter-counterOfTrainees);
        int counterOfWorkers = counter - counterOfTrainees - counterOfFreelancers;
        Employee[] trainees = new Trainee[counterOfTrainees];
        Employee[] workers = new Worker[counterOfWorkers];
        Employee[] freelancers = new Freelancer[counterOfFreelancers];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = generateEmployee("worker");
        }

        for (int i = 0; i < freelancers.length; i++) {
            freelancers[i] = generateEmployee("freelancer");
        }

        for (int i = 0; i < trainees.length; i++){
            trainees[i] = generateEmployee("trainee");
        }

        Employee[] employees = new Employee[counter];

        System.arraycopy(workers, 0, employees, 0, workers.length);
        System.arraycopy(freelancers,0,employees, workers.length,freelancers.length);
        System.arraycopy(trainees,0,employees, workers.length+freelancers.length,trainees.length);

        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(12);

        for (Employee employee: employees){
            System.out.println(employee);
        }

        System.out.println("\n");
//        int[] arr = {4, -6, 8, 10, 12, -7};
//        Arrays.sort(employees, new SalaryComparator());

//        Arrays.sort(employees);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(employees, new AgeComparator());

        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
