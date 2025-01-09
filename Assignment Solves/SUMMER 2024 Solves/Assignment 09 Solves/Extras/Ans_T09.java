public class Ans_T09 {
    public static void main(String[] args) {
        char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int[] studentScores = new int[7];
        studentScores = getScores(studentGrades, studentScores);
        System.out.println("Output expectation:");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println(studentScores[i] );
        }
    }
    public static int[] getScores(char[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'A') {
                b[i] = 100;
            }
            else if (a[i] == 'B') {
                b[i] = 90;
            }
            else if (a[i] == 'C') {
                b[i] = 70;
            }
            else {
                b[i] = 0;
            }
        }
        return b;
    }
}
