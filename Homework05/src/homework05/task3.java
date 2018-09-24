package homework05;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String srt = sc.nextLine();
        System.out.println(toInt(srt));
    }

    static int toInt(String a) {
        int n = 1;
        int m = 0;
        char[] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0 ; n *= 10,i--){
            m += (arr[i] - '0') * m;
        }
        return m;
    }
}
