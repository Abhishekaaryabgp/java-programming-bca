import java.util.Scanner;

class Sum
{
 public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("A = ");
        int a = sr.nextInt();
        System.out.print("B = ");
        int b = sr.nextInt();
        int c = a + b;
        System.out.println("Sum = " + c);
        sr.close(); // this is computersallary
    }
}
