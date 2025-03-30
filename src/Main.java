import java.util.Scanner;

public class Main {
    //complexity: linear - O(n)
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Minimum: " + minimum(arr, n));
        scanner.close();
    }

    private static int minimum(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //complexity; linear - O(N)
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Average: " + average(arr, n));
        scanner.close();
    }

    private static double average(int[] arr, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }
    // complexity : O(sqr.root(N))
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Composite"));
        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // complexity; linear - O(N)
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    //time complexity; linear - O(2^N)
    //space complexity: O(N)
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Complexity; linear - O(log N)
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(a + "^" + n + " = " + power(a, n));
        scanner.close();
    }

    private static long power(int a, int n) {
        if (n == 0) return 1;
        long halfPower = power(a, n / 2);
        if (n % 2 == 0)
            return halfPower * halfPower;
        else
            return a * halfPower * halfPower;
    }
    //Complexity; linear - O(N!)
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        permute(input, "");
        scanner.close();
    }

    private static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }
    //Complexity : O(N)
    public static void task8() {
        System.out.println(isAllDigits("123456", 0));
        System.out.println(isAllDigits("123a12", 0));
    }

    private static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
    //complexity: O(k)
// space complexity: O(1)
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + binomial(n, k));
        scanner.close();
    }

    private static int binomial(int n, int k) {
        int res = 1;
        if (k > n - k) k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    //complexity: O(log(min(a,b)))
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        scanner.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        task1();

    }
}

