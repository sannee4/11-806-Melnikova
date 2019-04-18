package com.company;

public class Student {
    private int age;
    public String name;
    private Iterable i;

    public Student(String name) {
        this.name = name;
    }

    private void passExam(String exam){
        System.out.println(exam+"  ваще изи");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", i=" + i +
                '}';
    }

}
