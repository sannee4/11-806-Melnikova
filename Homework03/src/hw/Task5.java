package hw;

public class Task5 {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 2, 11, 133};

        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            x = x + arr[i];
            if (i == arr.length - 1) {
                break;
            }
            int next = arr[i + 1];
            int digitsInNext = (int) Math.ceil(Math.log10(next));
            for (int j = 0; j < digitsInNext; j++) {
                x = x * 10;
            }
        }

        System.out.println("X = " + x);
    }
}
