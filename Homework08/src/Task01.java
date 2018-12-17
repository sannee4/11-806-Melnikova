import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0;
        int sumOfRow = 0;
        int brDiagonal = 0;
        int lastsumOfRow = -1;
        int sumOfColum = 0;
        int lastsumOfColumn = -1;

        boolean isMagic = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfRow += array[i][j];
                sumOfColum += array[j][i];
                if (i == n - j - 1) mainDiagonal += array[i][j];
                if (i == j) brDiagonal += array[i][j];
            }

            if ((lastsumOfRow != -1 && sumOfRow != lastsumOfRow) || lastsumOfColumn != -1 && sumOfColum != lastsumOfColumn) {
                isMagic = false;
            }
            lastsumOfRow = sumOfRow;
            lastsumOfColumn = sumOfColum;
            sumOfRow = 0;
            sumOfColum = 0;
        }

        if (mainDiagonal != brDiagonal) {
            isMagic = false;
        }

        System.out.println("is Magic");
    }
}
