public class Ans_E_A_B {
    public static void main(String[] args) {
        boolean res = isTriangle(7,5,10);
        System.out.println( res );
        boolean res1 = isTriangle(3,2,1);
        System.out.println( res1 );
        triArea(3,2,1);
        triArea(7,5,10);
    }
    public static boolean isTriangle(int a, int b, int c) {
        boolean flag = true;
        if (a + b <= c || a + c <= b || b + c <= a){
            flag = false;
            return flag;
        }
        return flag;
    }
    public static void triArea(int a, int b, int c) {
        if (isTriangle(a,b,c)){
            int s = a + b + c;
            s/=2 ;
            System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
        else {
            System.out.println( "Can't form a triangle") ;
        }
    }
}
