package ru.geekbrains.seminar7.observer.hw.models;

import java.util.Arrays;
import java.util.Iterator;

public class JobSickerArrayList<JobSicker> implements Iterable<JobSicker> {

    @Override
    public Iterator<JobSicker> iterator() {
        return new JobSickerArrayList.MyArrayListIterator();
    }


        //region Private Fields
        private JobSicker[] array;
        private int lastElementIndex=-1;
        //endregion

        //region Public Methods
        public int getCapacity(){
            return array.length;
        }
        public int getSize(){
            return lastElementIndex;
        }

        public void add(JobSicker item){
            if (lastElementIndex + 1 < array.length){
                array[++lastElementIndex] = item;
            }
        }

        //endregion

        //region Public Constructor
        public JobSickerArrayList(){
        }
        //endregion

        //region Class for Constructor
        class MyArrayListIterator implements Iterator<JobSicker>{
            Iterator<JobSicker> iterator = Arrays.stream(array).iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public JobSicker next() {
                return iterator.next();
            }
        }
        //endregion
    }

