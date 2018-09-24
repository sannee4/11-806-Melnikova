package homework06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println("Самая длинная цепочка повторяющихся элементов =" + l(m, n));
    }

    static int l(int[] m, int n) {
        int l1 = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (m[i] == m[i + 1]) {
                l1++;
            } else {
                if (max < 1) {
                    max = 1;
                }
                l1 = 1;
            }

        }
        return max;
    }
}
