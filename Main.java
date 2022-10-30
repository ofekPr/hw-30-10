public class Main {
    public static int sumN(int n) {
        if (n == 0) {
            return n;
        }
        return sumN(n - 1) + n;
    }

    public static int factorialN(int n) {
        if (n == 1) {
            return n;
        }
        return factorialN(n - 1) * n;
    }

    public static int productOddN(int n) {
        if (n == 1) {
            return n;
        }
        if(n % 2 == 0) {
            return productOddN(n - 1);
        }
        return productOddN(n - 2) * n;
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return n;
        }
        return sumDigits(n / 10) + n % 10;
    }

    public static int divide(int a, int b) {
        if (a <= 0) {
            return 0;
        }
        return divide(a - b, b) + 1;
    }

    public static void main(String[] args) {
        System.out.println(sumN(10));
        System.out.println(factorialN(10));
        System.out.println(productOddN(7));
        System.out.println(sumDigits(1953));
        System.out.println(divide(125 ,5));
    }
}
