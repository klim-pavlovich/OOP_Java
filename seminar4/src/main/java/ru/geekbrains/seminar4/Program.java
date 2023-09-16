package ru.geekbrains.seminar4;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(12);

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[100]);
        MyArrayList<Integer> myArrayListInt = new MyArrayList<>(new Integer[100]);
        MyArrayList<String> myArrayListString = new MyArrayList<>(new String[100]);
        MyArrayList<Boolean> myArrayListBoolean = new MyArrayList<>(new Boolean[100]);
        myArrayListInt.add(12);
        myArrayListInt.add(-1);
        myArrayListInt.add(50);
        myArrayList.add(new Employee("Vasya",18));
        myArrayListString.add("String");
        myArrayListBoolean.add(false);

        // Плюс необобщенных коллекций - можно поместить, что угодно
        // Минус - после такого как элемент попал в коллекцию, доступ к нему осуществляется
        // через переменную типа Object (upcasting)
        // тогда нужен будет постоянный даункаст
        // instanceof помогает выйти из этой ситуации
        // но такой подход не очень, тк приходится делать даункаст каждый раз и проверять тип

        //
        System.out.println("Кол-во элементов коллекции: " + myArrayList.getSize());

        for(Employee e: myArrayList){
            /* if (e instanceof Employee) {
                Employee employee = (Employee) e;
                System.out.println("Возраст сотрудника: " + employee.getAge());
            }*/
            // коллекция универсальная, но нужно постоянно даункастить
            // Проблема такого подхода - не поработать с состоянием отдельного типа

            if (e != null){
                System.out.println(e);
                System.out.println("Возраст сотрудника: " + e.getAge());
            }
        }

        Integer[] array1 = new Integer[] {3,4,1,5,9,6,1};
        String[] array2 = new String[] {"AA","BB","CC","DD"};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // Без обобщения массив поменяется на уровне Object, чтобы снова получить
        // массив Integer[] придется даункастить, с обобщением вернется массив
        // с оберткой от переменной
        Integer[] arrayOut = ArrayUtils.<Integer>replaceTwoElements(array1,2,3);
        String[] arrayOut2 = ArrayUtils.<String>replaceTwoElements(array2,2,3);
        System.out.println(Arrays.toString(arrayOut));
        System.out.println(Arrays.toString(arrayOut2));
    }
}
