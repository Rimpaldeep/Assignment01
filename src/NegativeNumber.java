import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the negative number: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>=0) {
            sum= sum+a;
            a++;
            System.out.println("Enter the number again");
            a=sc.nextInt();
            }
        System.out.println("Sum of the entered numbers = " + sum);
        }
    }
