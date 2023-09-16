package ru.geekbrains.seminar4;

import java.util.Arrays;
import java.util.Iterator;

// лучше называть универсальный тип локанично
// E - element (Java), T - type (С#)
// в целом можно как угодно, но тип должен быть
// ссылочным либо оберткой над примитивным типом данных
public class MyArrayList<E> implements Iterable<E>{

    private E[] array;
    private int lastElementIndex = -1;

    public int getCapacity(){
        return array.length;
    }

    public int getSize(){
        return lastElementIndex+1;
    }

    public void add(E item){
        if (lastElementIndex + 1 < array.length){
            array[++lastElementIndex] = item;
        }
    }

    public MyArrayList(E[] array) {
        this.array = array;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

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
}
