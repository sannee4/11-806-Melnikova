package com.company.superbestawesomeframework;

public class SimplStudent {
    int age;
    String name;

    public SimplStudent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimplStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
