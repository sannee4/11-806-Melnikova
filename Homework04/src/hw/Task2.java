package hw;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String s = scanner.nextLine();

        System.out.println("Введите число");
        int n = scanner.nextInt();

        System.out.println(s);

        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int newIndex = i + n;
            if(newIndex >= s.length()) {
                newIndex = newIndex - s.length();
            }
            chars[newIndex] = s.charAt(i);
        }

        String newS = "";
        for (int i = 0; i < chars.length; i++) {
            newS += chars[i];
        }

        System.out.println(newS);
    }
}
