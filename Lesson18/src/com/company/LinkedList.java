package com.company;

import java.util.Iterator;

public interface LinkedList<T> {
    void add(T element);

    void add(T element, int index);

    Node<T> get(int index);

    int size();

    Node<T>[] toArray();

    boolean contains(T element);

    void remove(int index);

    void addAll (LinkedList<T> elements, int index);

    void addAll (LinkedList<T> elements);

    Iterator<Node<T>> iterator();

}
