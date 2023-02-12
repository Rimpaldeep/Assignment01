import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upto what digit you want to add the sum:");
        int a = sc.nextInt();
        int b = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (b <= a) {
            if (b % 2 == 0) {
                System.out.println(b + " is an even number");
                sum1 = sum1 + b;
            } else {
                System.out.println(b + " is an odd number");
                sum2 = sum2 + b;
            }
            b++;
        }
        System.out.println("Sum of even numbers = " + sum1);
        System.out.println("Sum of odd numbers = " + sum2);
    }
}








