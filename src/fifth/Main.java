package fifth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                sum1 = sum1 + x;
            } else {
                sum2 = sum2 + x;
            }
        }
        System.out.println(sum1 - sum2);
    }
}
