package ru.geekbrains.seminar4;

public class ArrayUtils {

    public static <T> T[] replaceTwoElements(T[] array, int index1, int index2){
        if (array==null){
            throw new NullPointerException();
        }
        if (index1 >= array.length || index2 >= array.length || index1<0 || index2 < 0){
            throw new IndexOutOfBoundsException();
        }
        T[] arrayCloned = array.clone();
        T obj = arrayCloned[index1];
        arrayCloned[index1]=arrayCloned[index2];
        arrayCloned[index2] = obj;
        return arrayCloned;
    }

}
