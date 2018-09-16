package hw;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] reversed = new int[n];

        for (int i = 0; i < arr.length; i++) {
            reversed [(arr.length - 1) - i] = arr[i];
        }

        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
    }
}
