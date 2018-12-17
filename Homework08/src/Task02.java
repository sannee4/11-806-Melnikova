import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int sumOfRow = 0;
        int lastSumOfRow = 0;
        int indexOfRow = 0;

        int sumOfColumn = 0;
        int lastSumOfColumn = 0;
        int indexOfColumn = 0;

        int offset = 0;

        for (int j = 0; j < n; j++) {
            if (offset == 0) {
                for (int i = 0; i < m; i++) {
                    sumOfColumn += array[i][j];
                    if (i == m - 1 && sumOfColumn > lastSumOfColumn) {
                        indexOfColumn = j;
                        lastSumOfColumn = sumOfColumn;
                    }
                }
            }

            sumOfRow += array[offset][j];
            if (j == n - 1 && sumOfRow > lastSumOfRow) {
                indexOfRow = offset;
                lastSumOfRow = sumOfRow;
                sumOfRow = 0;
                offset++;
                j = -1;
            }
            sumOfColumn = 0;
            if (offset - 1 == m - 1) j = n;
        }

        System.out.println("cтрока:");
        for (int j = 0; j < n; j++) {
            System.out.print(array[indexOfRow][j] + " ");
        }


        System.out.println("cтолбец:");
        for (int i = 0; i < m; i++) {
            System.out.println(array[i][indexOfColumn]);
        }
    }
}
