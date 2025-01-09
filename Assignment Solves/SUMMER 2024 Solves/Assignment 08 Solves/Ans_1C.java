import java.util.Scanner;

public class Ans_1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean result = isPos(n);
        System.out.println(result);
    }
    public static boolean isPos(int n) {
        if (n >=0 ){
            return true;
        }return false ;
    }
}
