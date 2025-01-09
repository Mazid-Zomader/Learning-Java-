import java.util.Scanner;

public class Ans_2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double volume = sphereVolume(radius);
        System.out.println(volume);
    }
    public static double sphereVolume(double radius) {
        return (4/3.0)*Math.PI * Math.pow(radius,3);
    }
}
