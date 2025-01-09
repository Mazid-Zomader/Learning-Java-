import java.util.Scanner;

public class Ans_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
    }
    public static int sumDigits(int n) {
        int sum = 0;
        if (n/10 == 0){
            return n%10;
        }
        else {
            sum = n%10;
            return sum + sumDigits(n/10);
        }
    }
}
