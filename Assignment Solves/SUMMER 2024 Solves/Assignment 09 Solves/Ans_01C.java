import java.util.Scanner;

public class Ans_01C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.print(nToOne(1,n));
    }
    public static int nToOne(int n, int N) {
        int sum = 0;
        if (N == n) {
            return n;
        } else {
            sum += N ;
            return (sum + nToOne(n, N-1));
        }

    }
}
