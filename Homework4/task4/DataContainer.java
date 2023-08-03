package Homework4.task4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] elements;
    private int size;

    public DataContainer() {
        elements = (T[]) new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            expandArray();
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return elements[index];
    }

    public void sort(Comparator<T> comparator) {
        Arrays.sort(elements, 0, size, comparator);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    private void expandArray() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}
