package com.codegile.univ.com.codegile.univ.raluca.week4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomMap<K, V> implements Map<K, V> {
    private int size;
    private Node<K, V>[] elements;


    public CustomMap(int size) {
        this.size = 0;
        elements = new Node[size];
    }

    public void setSize(int size) {
        this.size = size;
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
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
    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && key.equals(elements[i].getKey())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(elements[i].getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && key.equals(elements[i].getKey())) {
                return elements[i].getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        // Paul
        V oldValue = get(key);
        Node<K, V>[] newElements;

        if (containsKey(key)) {
            for (Node<K, V> node : elements) {
                if (node.getKey().equals(key)) {
                    node.setValue(value);
                }
            }
        } else {
            int newSize = size + 1;
            newElements = copyOfElements(newSize);
            newElements[newSize - 1] = new Node<>(key, value);
            this.elements = newElements;
            size = newSize;
        }

        return oldValue;

//        // Raluca
//        Node[] newElements = new Node[size];
//        V oldValue = null;
//        boolean containsKey = false;
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] != null && key.equals(elements[i].getKey())) {
//                oldValue = elements[i].getValue();
//                newElements[i].setValue(value);
//                containsKey = true;
//                continue;
//            }
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
//        if (containsKey) {
//            return oldValue;
//        } else {
//            //setSize(elements.length);
//
//            newElements[size].setKey(key);
//            newElements[size].setValue(value);
//        }
//        elements = newElements;
//        return null;
    }

    private Node<K, V>[] copyOfElements(int size) {
        if (size < this.size) {
            throw new RuntimeException("Size cannot be lower than initial size");
        }
        return Arrays.copyOf(elements, size);
    }

    @Override
    public V remove(Object key) {
        Node[] newElements = new Node[size];
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && key.equals(elements[i].getKey())) {
                newElements[i] = elements[i + 1];
                continue;
            } else newElements[i] = elements[i];

        }
        elements = newElements;
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {
        elements = null;
        size = 0;

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
       /* Map<K, V> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (elements[i] != null) {
                map.put(elements[i].getKey(), elements[i].getValue());
            }
        }*/
        return null;
    }

    @Override
    public String toString() {
        return "CustomMap{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
