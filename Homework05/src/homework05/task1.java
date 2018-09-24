package homework05;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String k = "n";
        while (1 == 1) {
            if (k.equals("n")) {
                System.out.println("Введите " + n + "число");
                n = ++n;
                int a = sc.nextInt();
                System.out.println("Введите оператор");
                String s = sc.next();
                System.out.println("Введите " + n + "число");
                int b = sc.nextInt();
                n = ++n;
                int result;
                if (s.equals("+")) {
                    result = a + b;
                    System.out.println("Ответ: " + result);
                } else if (s.equals("-")) {
                    result = a - b;
                    System.out.println("Ответ: " + result);
                } else if (s.equals("*")) {
                    result = a * b;
                    System.out.println("Ответ: " + result);
                } else if (s.equals("/")) {
                    result = a / b;
                    System.out.println("Ответ: " + result);
                }
                System.out.println("Сбросить результат? y/n?");
                k = sc.next();
            } else if (k.equals("y")) {
                n = 1;
                k = "n";
            }
        }
    }

}

