package org.example;

public class MyArrayList<E> {

    private E[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(E element) {
        if (size == data.length) {
            expandCapacity();
        }
        data[size++] = element;
    }

    private void expandCapacity() {
        int newCapacity = data.length * 2;
        E[] newData = (E[]) new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }
}