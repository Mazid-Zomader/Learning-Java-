import java.util.Scanner;

public class Ans_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        sequence(n) ;
    }
    public static void sequence(int n) {
        if (isPos(n)) {
            int temp = 0;
            if (isEven(n)) {
                while (temp <= n) {
                    System.out.print(temp + " ");
                    temp += 2;
                }
            }
            else{
                while (temp < n) {
                    System.out.print(temp + " ");
                    temp += 2;
                }
            }
        }
        else {
            if (isEven(n)) {
                n += 1 ;
            }
            while(n <= -1){
                System.out.print(n + " ");
                n += 2;
            }
        }
    }
    public static boolean isPos(int n) {
        if (n >=0 ){
            return true;
        }return false ;
    }
    public static boolean isEven(int n) {
        if (n % 2 == 0){
            return true;
        }return false ;
    }
}
