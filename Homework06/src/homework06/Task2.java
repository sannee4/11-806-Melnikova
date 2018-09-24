package homework06;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        String s = sc.nextLine();
        System.out.println(l(s));
    }

    static String l(String s) {
        String cs = "";
        for (int i = 0; i < s.length(); i++) {
            char sym = s.charAt(i);
            if (sym != ' ') {
                cs += sym;
            }
        }
        return cs;
    }

}
