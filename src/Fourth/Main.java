package Fourth;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner =  new Scanner(System.in);
        n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result*i;

        }
        System.out.println(result);
    }
}
