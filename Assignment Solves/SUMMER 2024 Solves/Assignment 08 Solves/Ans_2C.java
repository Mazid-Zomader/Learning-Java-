import java.util.Scanner;

public class Ans_2C {
    public static void main(String[] args) {
        findSpace(10,"circle");
        findSpace(10,"sphere");
        findSpace(10,"square");
    }
        public static void findSpace ( int n, String ans){
            if (ans.equals("circle")) {
                System.out.println(circleArea(n / 2));
            }
            else if (ans.equals("sphere")) {
                System.out.println(sphereVolume(n / 2));
            }
            else {
                System.out.println("Wrong parameter");
            }
        }
        public static double circleArea ( int n){
            return Math.PI * Math.pow(n, 2);
        }
        public static double sphereVolume ( double radius){
            return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
}
