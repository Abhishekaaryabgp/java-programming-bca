import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my multiplication Calculator :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        int m = a * b;
        int p = a + b;
        int s = a - b;
        int d = a / 2;
        System.out.println("The Multiplication is :" + m);
        System.out.println("The Addition is :" + p);
        System.out.println("The Subtraction is :" + s);
        System.out.println("The Division is :" + d);
        sc.close();

    }
}
