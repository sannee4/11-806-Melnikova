package hw;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean correct = true;
        boolean highReached = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (highReached) {
                    correct = false;
                    break;
                }
            } else if (arr[i] > arr[i + 1]) {
                highReached = true;
            }
        }

        System.out.println(correct);
    }
}
