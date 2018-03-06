package com.codegile.univ.raluca.week1.day1.problem1.com.codegile.univ.raluca.week3;


import java.util.*;


public class CustomList<T> implements List<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public CustomList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        Objects.requireNonNull(a);
        if (size() > a.length) {
            return (T1[]) toArray();
        }
        Iterator<T> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Object next = iterator.next();
            a[index++] = (T1) next;
        }
        for (int i = index; i < a.length; i++) {
            a[i] = null;
        }
        return a;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        elements = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T set(int index, T element) {
        elements[index] = element;
        return (T) elements[index];
    }

    @Override
    public boolean add(T t) {
        add(size, t);
        return true;
    }

    @Override
    public void add(int index, T element) {
        size++;
        checkRange(index);
        Object[] newList = new Object[size];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                newList[i] = element;
                continue;
            }
            newList[i] = elements[i];
        }
        elements = newList;
    }

    private void checkRange(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public T remove(int index) {
        checkRange(index);
        T removedElement = (T) elements[index];
        Object[] newIist = new Object[--size];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                newIist[i] = elements[i + 1];
            } else if (i > index) {
                newIist[i] = elements[i + 1];
            } else {
                newIist[i] = elements[i];
            }
        }
        elements = newIist;
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return listIterator(0);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        Object[] newList = new Object[toIndex - fromIndex];
        int n = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            newList[n++] = elements[i];
        }

        List<Object> list = Arrays.asList(newList);
        return (List<T>) list;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "elements= " + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}




