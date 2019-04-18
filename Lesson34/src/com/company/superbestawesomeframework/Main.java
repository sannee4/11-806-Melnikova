package com.company.superbestawesomeframework;

import java.util.List;
import com.company.Student;
import static com.company.superbestawesomeframework.SuperBestAwesomeFramework.*;

public class Main {
    public static void main(String[] args) {
//        List<SimplStudent> l= getMany(SimplStudent.class, 100);
//       System.out.println(l);
////
//        List<StringBuilder> sbs = getMany(StringBuilder.class,10);
//        System.out.println(sbs);

        List<SimplStudent> list = SuperBestAwesomeFramework.getManyWithCons(SimplStudent.class, 100, "John", 18);
        System.out.println(list);
    }
}
