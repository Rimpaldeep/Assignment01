import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int a = sc.nextInt();
        int b = 1;
        while (a > 1) {
            b = b*a;
            a--;
            System.out.println(a);
        }
        System.out.println("Factorial is: " + b);
    }
}
