import java.util.Scanner;

// variant 1
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt();
        int[] arr = new int[n * n];
        System.out.println("Введите N*N чисел");
        for (int i = 0; i < n * n; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public class Fill {
        public void main2(String[] args) {
            int n = 7;
            int[][] matrix = new int[n][n];
            spiralFill(matrix);
            int[][] oneMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    }
                }
            }
            multiply(matrix, oneMatrix);
        }

        void multiply(int[][] matrix1, int[][] matrix2) {

        }

        void spiralFill  (int[][] matrix) {
            int n = matrix.length;
            int count = 1;
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    matrix[i][j] = count++;
                }
                for (int j = i; j < n - 1 - i; j++) {
                    matrix[j][n - 1 - i] = count++;
                }
                for (int j = n - 1 - i; j > i; j--) {
                    matrix[n - 1 - i][j] = count++;
                }
                for (int j = n - 1 - i; j > i; j--) {
                    matrix[j][i] = count++;
                }
            }
            if (n % 2 == 1) {
                matrix[n / 2][n / 2] = count;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }


    public static int overDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    public static void main1(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];
        Fill.spiralFill(matrix);
        System.out.println("\n" + overDiagonalSum(matrix));
    }
}