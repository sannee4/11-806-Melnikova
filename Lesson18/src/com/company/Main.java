package com.company;

public class Main {
    public static void main(String[] args) {
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.size();
        intLinkedList.add(5);
        intLinkedList.add("Sane4ka");
        intLinkedList.add("sannee4ka", 1);
        intLinkedList.remove(0);
        intLinkedList.get(1);
        intLinkedList.contains(6);
        System.out.println(intLinkedList.contains(5));
    }
}
