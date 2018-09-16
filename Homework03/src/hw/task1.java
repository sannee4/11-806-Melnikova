package hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Введите рост для "+ n + " студентов");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        double averageHeight = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            averageHeight = sum / n;

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > averageHeight) {
                count += 1;
            }

        }
        System.out.println(averageHeight);
        System.out.println(count);

    }
}
