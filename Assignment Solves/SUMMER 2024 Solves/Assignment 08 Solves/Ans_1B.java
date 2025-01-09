import java.util.Scanner;

public class Ans_1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean result = isEven(n);
        System.out.println(result);
    }
    public static boolean isEven(int n) {
        if (n % 2 == 0){
            return true;
        }return false ;
    }
}
