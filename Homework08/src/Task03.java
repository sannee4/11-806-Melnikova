import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int count = 1;
        int offset = 0;
        int ring = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int r = 0; r < ring; r++) {
            for (int i = offset; i < 1 + offset; i++) {
                for (int j = offset; j < n - offset; j++) {
                    matrix[i][j] = count;
                    count++;
                }
            }


            for (int i = 1 + offset; i < n - offset; i++) {
                for (int j = n - 1 - offset; j < n - offset; j++) {
                    matrix[i][j] = count;
                    count++;
                }
            }

            for (int i = n - 1 - offset; i < n - offset; i++) {
                for (int j = n - 2 - offset; j >= offset; j--) {
                    matrix[i][j] = count;
                    count++;
                }
            }

            for (int i = n - 2 - offset; i > offset; i--) {
                for (int j = offset; j < 1 + offset; j++) {
                    matrix[i][j] = count;
                    count++;
                }
            }
            offset++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

