import java.util.Scanner;

public class Ans_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        evenChecker(10);
        evenChecker(17);
    }
    public static void evenChecker(int num) {
        if (num % 2 == 0) {
            System.out.println("Even!!");
        }
        else {
            System.out.println("Odd!!");
        }
    }
}