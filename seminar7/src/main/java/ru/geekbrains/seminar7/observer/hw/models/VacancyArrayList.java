package ru.geekbrains.seminar7.observer.hw.models;

import java.util.Arrays;
import java.util.Iterator;

public class VacancyArrayList<E> implements Iterable<E> {

    //region Private Fields
    private E[] array;
    private int lastElementIndex=-1;
    //endregion

    //region Public Methods
    public int getCapacity(){
        return array.length;
    }
    public int getSize(){
        return lastElementIndex;
    }

    public void add(E item){
        if (lastElementIndex + 1 < array.length){
            array[++lastElementIndex] = item;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }
    //endregion

    //region Public Constructor
        public VacancyArrayList(){
        }
    //endregion

    //region Class for Constructor
    class MyArrayListIterator implements Iterator<E>{
        Iterator<E> iterator = Arrays.stream(array).iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public E next() {
            return iterator.next();
        }
    }
    //endregion
}
