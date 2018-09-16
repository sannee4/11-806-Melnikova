package hw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n-1; i++) {

            if (arr[i - 1] < arr[i] & arr[i] > arr[i + 1]) {
                count ++;

            }
        }
        System.out.println(count);

    }
}