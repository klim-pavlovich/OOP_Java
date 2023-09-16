package ru.geekbrains.seminar4.homework;

import java.util.Arrays;
import java.util.Iterator;

public class Box<T extends Fruit> implements Iterable<T>/*, Comparable<T> */{
    protected  T[] fruits;
    private int lastElementIndex = -1;

    public int getSize(){return lastElementIndex+1;}

    public void addFruit(T item){
        if (lastElementIndex + 1 < fruits.length){
            fruits[++lastElementIndex] = item;
        }
    }


    public Box(T[] fruits) {
        this.fruits = fruits;
    }

    public void setFruits(T[] fruits) {
        this.fruits = fruits;
    }

    public T[] getFruits() {
        return fruits;
    }

    public float getWeight(){
        return getSize() * fruits[0].weight;
    }

    @Override
    public Iterator<T> iterator() {
        return new BoxIterator();
    }

    public T getFirstElement(){
        if (lastElementIndex > 0){
            return fruits[0];
        }
        else{
            return null;
        }
    }
    public boolean compare(Box otherBox) {
        if (this.getFirstElement() != null || otherBox.getFirstElement() != null) {
            float thisBoxWeight = this.getWeight();
            float otherBoxWeight = otherBox.getWeight();
            return thisBoxWeight == otherBoxWeight;
        }
        else{
            return false;
        }
    }

    private boolean isBoxPoured (Box otherBox){
        if(this.getClass()==otherBox.getClass()){
            return true;
        }else {return false;}}

    public void pourFruits (Box<T> otherBox){
            if (this.isBoxPoured(otherBox)){
            for(T fruit: fruits){
                otherBox.addFruit(fruit);
            };
            lastElementIndex = -1;
            Arrays.fill(fruits, null);
            }
        }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + Arrays.toString(fruits) +
                ", lastElementIndex=" + lastElementIndex +
                '}';
    }

    class BoxIterator implements Iterator<T>{
        Iterator<T> iterator = Arrays.stream(fruits).iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public T next() {
                return iterator.next();
            }
        }
    }

