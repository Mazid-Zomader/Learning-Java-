import java.util.Scanner;

public class Ans_01B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        nToOne(1, n);
    }
    public static int nToOne(int n, int N) {
        if (N== 1) {
            System.out.print(N+" ");
            return N;
        } else {
            System.out.print(N+" ");
            return nToOne(n, N-1);
        }
    }
}
