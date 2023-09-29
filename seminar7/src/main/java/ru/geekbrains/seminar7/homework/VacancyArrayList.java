package ru.geekbrains.seminar7.homework;

import java.util.Arrays;
import java.util.Iterator;

public class VacancyArrayList<Vacancy> implements Iterable<Vacancy> {

    //region Private Fields
    private Vacancy[] array;
    private int lastElementIndex = -1;
    //endregion

    //region Public Methods
    public int getCapacity() {
        return array.length;
    }


    public int getSize() {
        return lastElementIndex;
    }

    public void add(Vacancy item) {
        if (array.equals(null)) {
            array[++lastElementIndex] = item;
        } else if (lastElementIndex + 1 < array.length) {
            array[++lastElementIndex] = item;
        }
    }

    @Override
    public Iterator<Vacancy> iterator() {
        return new MyArrayListIterator();
    }
    //endregion

    //region Public Constructor
    public VacancyArrayList(int capacity) {
        array = (Vacancy[]) new Object[capacity];
    }
    //endregion

    //region Class for Constructor
    class MyArrayListIterator implements Iterator<Vacancy> {
        Iterator<Vacancy> iterator = Arrays.stream(array).iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Vacancy next() {
            return iterator.next();
        }
    }
    //endregion
}
