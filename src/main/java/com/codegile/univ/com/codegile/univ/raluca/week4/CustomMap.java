package com.codegile.univ.com.codegile.univ.raluca.week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomMap<K, V> implements Map<K, V> {
    private int size;
    Node<K, V>[] elements;

    public CustomMap(int size) {
        this.size = size;
        elements = new Node[size];
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;


        public Node(K key, V value, Node<K, V> next) {
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
            if (key.equals(elements[i].getKey())) return true;
        }

        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < size; i++) {
            if (value == elements[i].getValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        V val = (V) new ArrayList<V>();
        for (int i = 0; i < size; i++) {
            if (key == elements[i].getKey())
                val = elements[i].getValue();
        }
        return val;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
