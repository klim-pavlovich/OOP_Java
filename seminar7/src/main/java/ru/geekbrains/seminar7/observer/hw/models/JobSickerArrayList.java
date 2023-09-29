//package ru.geekbrains.seminar7.observer.hw.models;
//
//import java.util.Arrays;
//import java.util.Iterator;
//
//public class JobSickerArrayList<JobSeeker> implements Iterable<JobSeeker> {
//
//    @Override
//    public Iterator<JobSeeker> iterator() {
//        return new JobSickerArrayList.MyArrayListIterator();
//    }
//
//
//        //region Private Fields
//        private JobSeeker[] array;
//        private int lastElementIndex=-1;
//        //endregion
//
//        //region Public Methods
//        public int getCapacity(){
//            return array.length;
//        }
//        public int getSize(){
//            return lastElementIndex;
//        }
//
//        public void add(JobSeeker jobSeeker){
//            if (lastElementIndex + 1 < array.length){
//                array[++lastElementIndex] = jobSeeker;
//            }
//        }
//
//    public void remove(JobSeeker jobSeeker) {
//        int indexOfJobSeekerToRemove = -1;
//
//        // Найдем индекс искателя работы, которого нужно удалить
//        for (int i = 0; i <= lastElementIndex; i++) {
//            if (array[i].equals(jobSeeker)) {
//                indexOfJobSeekerToRemove = i;
//                break;
//            }
//        }
//
//        // Если найден, то удаляем его и сдвигаем остальные элементы
//        if (indexOfJobSeekerToRemove != -1) {
//            for (int i = indexOfJobSeekerToRemove; i < lastElementIndex; i++) {
//                array[i] = array[i + 1];
//            }
//            // Уменьшаем индекс последнего элемента и обнуляем последний элемент
//            lastElementIndex--;
//            array[lastElementIndex + 1] = null;
//        }
//        else{
//            System.out.println("Не удалось удалить искателя работы.");
//        }
//    }
//
//
//
//
//
//    //endregion
//
//        //region Public Constructor
//        public JobSickerArrayList(){
//        }
//        //endregion
//
//        //region Class for Constructor
//        class MyArrayListIterator implements Iterator<JobSeeker>{
//            Iterator<JobSeeker> iterator = Arrays.stream(array).iterator();
//
//            @Override
//            public boolean hasNext() {
//                return iterator.hasNext();
//            }
//
//            @Override
//            public JobSeeker next() {
//                return iterator.next();
//            }
//        }
//        //endregion
//    }
//
