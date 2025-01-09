import java.util.Scanner;

public class Ans_2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int n = sc.nextInt();
        double area = circleArea(n);
        System.out.println(area);
    }
    public static double circleArea(int n) {
        return Math.PI * Math.pow(n, 2);
    }
}
