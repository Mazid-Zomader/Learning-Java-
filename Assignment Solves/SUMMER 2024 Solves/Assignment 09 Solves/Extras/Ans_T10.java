public class Ans_T10 {
    public static void main(String[] args) {
        double t = convertToCm(16);
        System.out.println(t + " cm");
        double [] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0, 18.0};
         double averageLength = findAvgCm(cheetos_inches);
        System.out.println("The average Cheeto length is "+ averageLength +" cm");
    }
//    (a)
    public static double convertToCm(double num){
        return num*2.54 ;
    }
//    (b)
    public static double findAvgCm(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += convertToCm(arr[i]);
        }
        return sum/arr.length;
    }
}
