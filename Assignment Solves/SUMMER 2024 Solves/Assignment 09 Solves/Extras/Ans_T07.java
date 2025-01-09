import java.util.Scanner;

public class Ans_T07 {
    public static void main(String[] args) {
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
        System.out.println("Prime Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(i + ": " + arr[i]);
            }
        }
        System.out.println();
        System.out.println("Perfect Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                System.out.println(i + ": " + arr[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    (b)
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}