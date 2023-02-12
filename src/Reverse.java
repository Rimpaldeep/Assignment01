public class Reverse {
    public static void main(String[] args) {
        int a = 1234567;
        int b = 0;
        System.out.println("The reverse of " + a + " is :");
        while (a!=0) {
            b = b * 10;
            b = b + a%10;
            a = a/10;
        }
        System.out.println(b);
    }
}
