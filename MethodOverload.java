public class MethodOverload {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum("Hey", "You", "There!!!"));
        System.out.println(sum(2,4));
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static String sum(String a, String b, String c ){
        return a + b + c;
    }
    public static double sum(double a, double b){
        return a + b;
    }

}
