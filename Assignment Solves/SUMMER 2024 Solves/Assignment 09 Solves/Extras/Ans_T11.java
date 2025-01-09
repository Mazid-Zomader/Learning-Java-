import java.util.Scanner;

public class Ans_T11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String taskName = sc.nextLine();
        int vowel = isVowel(taskName);
        System.out.println("Number of vowels in the string: "+ vowel);
        int consonent = isConsonant(taskName);
        System.out.println("Number of vowels in the string: "+ consonent);
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        System.out.println( "The total number of vowels in the array is: " + vowelSum(names));
        System.out.println( "The total number of consonants in the array is: " + consonantSum(names));
    }
//    (a)
    public static int isVowel(String taskName) {
        int count = 0;
        for (int i = 0; i < taskName.length(); i++) {
            if ((int) taskName.charAt(i) == 65 || (int) taskName.charAt(i) == 69 || (int) taskName.charAt(i) == 73 || (int) taskName.charAt(i) == 79 || (int) taskName.charAt(i) == 85 || (int) taskName.charAt(i) == 97 || (int) taskName.charAt(i) == 101 || (int) taskName.charAt(i) == 105 || (int) taskName.charAt(i) == 111 ||(int) taskName.charAt(i) == 117  ){
                count += 1;
            }
        }
        return count;
    }
//    (b)
    public static int isConsonant(String taskName) {
        int count = 0;
        for (int i = 0; i < taskName.length(); i++) {
            if ((int) taskName.charAt(i) == 32 ||(int) taskName.charAt(i) == 65 || (int) taskName.charAt(i) == 69 || (int) taskName.charAt(i) == 73 || (int) taskName.charAt(i) == 79 || (int) taskName.charAt(i) == 85 || (int) taskName.charAt(i) == 97 || (int) taskName.charAt(i) == 101 || (int) taskName.charAt(i) == 105 || (int) taskName.charAt(i) == 111 ||(int) taskName.charAt(i) == 117  ){
            }
            else {
                count += 1;
            }
        }
        return count;
    }
//    (c)
    public static int vowelSum(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += isVowel(arr[i]);
        }
        return count;
    }
    public static int consonantSum(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += isConsonant(arr[i]);
        }
        return count;
    }
}
