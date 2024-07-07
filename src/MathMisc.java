import java.util.ArrayList;
import java.util.List;

public class MathMisc {

    public static void literalsTest() {
        int x1 = 10001;
        int x2 = 0146;
        int x3 = 0x2345;
        int x4 = 0b1111111;
        long l = 10123456L; // long literal
        float f = 3.5f;
        char ch1 = 'q';
        char ch2 = 062;
        char ch3 = '\u0061'; // lowercase a
        int i = 65;
        char ch4 = '\n';
        char chfrswcreg51qwe = '\r';
        char chfrswcrerereqw2 = '\t';
        String s = "Hsdfdrcw3eewfefe";
    }
    public static int twoSum(int a, int b) {
        return a + b;
    }

    public static int threeSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int fourSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int fiveSum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * This method calculates the greatest common divisor of two integers
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    /**
     * This method calculates the least common multiple of two integers
     * @param a the first integer
     * @param b the second integer
     * @return the least common multiple of a and b
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}