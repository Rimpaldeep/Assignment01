public class NaturalNumbers {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a<=10) {
            System.out.println(a);
            sum = sum + a;
            a++;
        }
        System.out.println("Sum of all numbers = " + sum);
    }

}
