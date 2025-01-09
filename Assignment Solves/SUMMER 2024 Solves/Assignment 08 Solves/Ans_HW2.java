public class Ans_HW2 {
    public static void main(String[] args) {
        System.out.println("(A)");
        System.out.println();
        showDots(5);
        System.out.println();

        showDots(3);
        System.out.println();
        System.out.println();
        System.out.println("(B)");
        System.out.println();
        show_palindrome(5);
        System.out.println();
        System.out.println();
        show_palindrome(3);
        System.out.println();
        System.out.println("(C)");
        System.out.println();
        System.out.println();
        showDiamond(5);
        System.out.println();
        showDiamond(3);
    }
//    (a)
    public static void showDots(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(".");
        }
    }
//    (b)
    public static void show_palindrome(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
        }
        for (int i= num-1; i > 0; i--) {
            System.out.print(i);
        }
    }
//    (c)
    public static void showDiamond(int num) {
        for (int i = 1; i <= num; i++) {
            showDots(num-i);
            show_palindrome(i);
            showDots(num-i);
            System.out.println();
        }
        for (int i = num-1; i > 0; i--) {
            showDots(num-i);
            show_palindrome(i);
            showDots(num-i);
            System.out.println();
        }

    }
}
