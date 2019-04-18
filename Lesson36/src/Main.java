import java.util.Scanner;

public class Main {
    public static int mainSum = 0;
    public static void main(String[] args) throws InterruptedException {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
            mainSum += arr[i];
        }
        System.out.println(mainSum);
        mainSum = 0;
        int k = n/5;
        int firstElem = 0;
        for (int i = 0; i < 5; i++) {
            CounterThread ct = new CounterThread(arr, firstElem, k);
            ct.start();
            ct.join();

            firstElem = k + 1;
            k = k + n/5;
        }
        System.out.println(mainSum);

    }
}

