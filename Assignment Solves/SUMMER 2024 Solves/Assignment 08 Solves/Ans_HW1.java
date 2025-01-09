import java.util.Scanner;

public class Ans_HW1{
    public static void main(String[] args) {
        boolean check = isPrime(7);
        System.out.println(check);
        boolean check1 = isPrime(15);
        System.out.println(check1);
        boolean check2 = isPerfect(6);
        System.out.println(check2);
        boolean check3 = isPerfect(33);
        System.out.println(check3);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int result = special_sum(num);
        System.out.println(result);
    }
//    (a)
    public static boolean isPrime(int n){
        for (int i = 2 ; i < n ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
//    (b)
    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i < n ; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }return  false;
    }
//    (c)
    public static int special_sum(int n){
        int sum = 0;
        for (int i = 2; i <= n ; i++){ // The 'n' is also looped here. If the teacher ask to not add the value of n, just remove the equal(=) sign form the loop :)
            if ( isPrime(i) || isPerfect(i)){
                sum += i;
            }
        }
        return sum;
    }
}
