package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main11 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Student> c = Student.class;
        Constructor<Student> constructor = c.getConstructor(String.class);
        Student s =constructor.newInstance("John");
        System.out.println(s);
    }
}
