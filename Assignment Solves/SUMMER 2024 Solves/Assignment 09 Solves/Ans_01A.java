import java.util.Scanner;

public class Ans_01A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        oneToN(1, n);
    }
    public static int oneToN(int n, int N) {
        if (n == N) {
            System.out.print(N+" ");
            return N;
        } else {
            System.out.print(n+" ");
            return oneToN(n+1, N);
        }
    }
}