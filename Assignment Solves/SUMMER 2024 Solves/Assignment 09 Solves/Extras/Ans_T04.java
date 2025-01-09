import java.util.Scanner;

public class Ans_T04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean check = isHappyNumber(n);
        System.out.println(check);
    }
    public static boolean isHappyNumber(int n) {
        boolean flag = true;
        while (flag) {
            int sum = 0;
            while (n != 0) {
                sum += (int) Math.pow((n % 10), 2);
                n = n / 10;
            }
            if (sum == 1) {
                break;
            }
            else if (sum == 4) {
                flag = false;
                break;
            }
            n = sum;
        }
        return flag;
    }
}
