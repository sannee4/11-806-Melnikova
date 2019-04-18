package com.company.superbestawesomeframework;

import com.company.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperBestAwesomeFramework {
    static <T> List<T> getMany(Class<T> c, int count) {
        List<T> l = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T o = c.newInstance();
                l.add(o);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return l;
    }

    static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params) {
        List<T> list = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                Arrays.stream(params).forEach(s-> list.add((T) s));
//                SimplStudent student = new SimplStudent("John");
//                Class aclass = SimplStudent.class;
//                Field field = aclass.getDeclaredField("age");
//                field.setAccessible(true);
//                field.set(student, 18);
//                list.add((T) student);
            }

        return list;
    }
}
