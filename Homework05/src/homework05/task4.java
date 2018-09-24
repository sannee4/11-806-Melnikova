package homework05;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.next();
        System.out.println("Введите символ-ключ u-верхний регистр or l-нижний регистр  ");
        String k = sc.next();
        if (k.equals("u")){
            s = s.toUpperCase();
        }else {
            s = s.toLowerCase();
        }
        System.out.println(s);
    }
}
