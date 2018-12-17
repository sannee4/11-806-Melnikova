public class ETask {
    public static void main(String[] args) {
        System.out.println(etask(345));
    }

    public static int etask(int n) {
        if (n > 0) {
            return ((n % 10) + etask(n / 10));
        } else {
            return 0;
        }
    }
}
