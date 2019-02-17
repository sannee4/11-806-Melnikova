package com.company;

import java.util.Iterator;

public class IntLinkedList<T> implements LinkedList {
    private Node head;
    private Node last;
    private int count = 0;

    @Override
    public void add(Object element) {
        Node newNode = new Node();
        newNode.setValue(element);
        if (count == 0) {
            head = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        count++;
    }

    //добавление элемента по индексу
    @Override
    public void add(Object element, int index) {
        Node newNode = new Node();
        newNode.setValue(element);
        get(index).setNext(newNode);
        if (index == 0) {
            head = newNode;
        } else {
            get(index - 1).setNext(newNode);
        }
        count++;
    }

    @Override
    public Node get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }

        Node elem = head;
        for (int i = 0; i < index; i++) {
            elem = elem.getNext();
        }
        return elem;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Node[] toArray() {
        Node[] nodeArray = new Node[size()];
        Node node = head;
        for (int i = 0; i <size() ; i++) {
            nodeArray[i] =(Node) node.getValue();
            node.getNext();
        }

        return nodeArray;
    }

    @Override
    public boolean contains(Object element) {
        Node node = head;
        while (node.getNext() != null) {
            if (node.getValue() == element) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node node = get(index - 1);
            node.setNext(get(index).getNext());
        }
        count--;
    }

    //добавление в середину
    @Override
    public void addAll(LinkedList elements, int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        if (index == 0) {
            head = elements.get(0);
        } else {
            Node newNode = new Node();
            newNode.setNext(get(size() - 1));

        }
        count = elements.size() - 1;

    }

    //добавление в конец
    @Override
    public void addAll(LinkedList elements) {
        for (int i = 0; i < elements.size(); i++) {
            add(get(size() - 1));
        }

    }

    class Iterator implements java.util.Iterator<Node<T>> {
        private int a;

        @Override
        public boolean hasNext() {
            return a < count;
        }

        @Override
        public Node<T> next() {
            return get(a++);
        }
    }

    @Override
    public java.util.Iterator<Node<T>> iterator() {
        return new Iterator();
    }
}
