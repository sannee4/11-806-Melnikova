package hw;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер 1-го массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Введите размер 2-го массива");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Введите " + n2 + " чисел");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            boolean isCurIndex = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] != arr[i + j]) {
                    isCurIndex = false;
                    break;
                }
            }
            if (isCurIndex) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Нет вхождения");
        } else {
            System.out.println("Индекс вхождения = " + index);
        }
    }
}
