package org.itstep;

import java.util.Arrays;

// FIXME: обобщенный тип должен быть классом расширяющим интерфейс Comparable<T>
class List<T> {
    private T[] arrays;

    public List() {
        // FIXME: создать массив типов Comparable
        this.arrays = (T[]) new Object[0];
    }

    public void add(T item) {
        arrays = Arrays.copyOf(arrays, arrays.length + 1);
        arrays[arrays.length - 1] = item;
    }

    public T get(int idx) {
        return arrays[idx];
    }

    public T min() {
        T min = arrays[0];
        // FIXME: реализовать поиск наименьшего элемента используя метод compareTo интерфейса IComparable<T>
        /*for(T item: arrays) {
            if(item < min) {
                min = item;
            }
        }*/
        return min;
    }

    public T max() {
        T max = arrays[0];
        // FIXME: реализовать поиск наибольшего элемента используя метод compareTo интерфейса IComparable<T>
        /*for(T item: arrays) {
            if(item > max) {
                max = item;
            }
        }*/
        return max;
    }
}
