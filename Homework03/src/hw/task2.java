package hw;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -999999;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (max < Math.abs(arr[i])) {
                max = Math.abs(arr[i]);
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}