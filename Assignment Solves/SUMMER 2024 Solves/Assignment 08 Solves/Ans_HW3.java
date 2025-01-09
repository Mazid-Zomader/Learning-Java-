import java.util.Scanner;

public class Ans_HW3 {
    public static void main(String[] args) {
        double t = calcTax(16,20000);
        System.out.println(t);
        double t1 = calcTax(20,18000);
        System.out.println(t1);
        System.out.println();
        calcYearlyTax();
    }
//    (a)
    public static double calcTax(int age, int salary) {
        if (age < 18 || salary <= 10000) {
            return 0.0;
        }
        else if (salary > 10000 && salary <= 20000) {
            return 0.07*salary;
        }
        else {
            return 0.14*salary;
        }
    }
    public static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        double tax = 0;
        if (age < 18) {
            System.out.println("Invalid ");
            System.out.println("Total Yearly Tax: "+ tax);
        }
        else {
            for (int i = 1 ; i <= 12 ; i++){
                System.out.print("Month"+i+" salary:");
                int salary = sc.nextInt();
                double calc = calcTax(age,salary);
                System.out.println("Month"+i+" tax: "+calc);
                tax += calc;
            }
            System.out.println("Total Yearly Tax: "+tax);
            }

    }
}
