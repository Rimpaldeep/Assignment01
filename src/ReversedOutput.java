import java.util.Scanner;

public class ReversedOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please input the value:");
        int a = sc.nextInt();
        int b = 0;
        while (a!=0) {
            b = b * 10;
            b = b + a%10;
            a = a/10;
        }
        System.out.println("Reverse of the input is: " + b);

    }
}
