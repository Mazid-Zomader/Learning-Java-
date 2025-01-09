import java.util.Scanner;

public class Ans_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        reverseDigit(n);
    }
    public static int reverseDigit(int n) {
        if (n/10 == 0){
            System.out.println(n%10);
            return n%10;
        }
        else {
            System.out.println(n%10);
            return reverseDigit(n/10);
        }
    }
}
