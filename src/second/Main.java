package second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x!=max1) {
                max2 = x;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}