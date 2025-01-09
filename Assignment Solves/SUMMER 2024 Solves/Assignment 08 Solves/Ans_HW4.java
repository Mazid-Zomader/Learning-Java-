import java.util.Scanner;

public class Ans_HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        onToN(1, N);
    }
    public static int onToN(int n, int N) {
        if (n == N) {
            System.out.print(N+" ");
            return N;
        } else {
            System.out.print(n+" ");
            return onToN(n+1, N);
        }
    }
}
