package hw;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        String s2 = "";
        s2 = s2 + s.substring(0, n1);
        s2 = s2 + s.substring(n2 + 1);

        System.out.println(s2);
    }
}
