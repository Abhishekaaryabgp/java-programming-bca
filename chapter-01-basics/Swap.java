import java.util.Scanner;

public class Swap {

  public static void main(String[] args) {
    System.out.println("Hello User Enter the 2 number to swap");
    Scanner ch = new Scanner(System.in);
    int temp;
    int a = ch.nextInt();
    int b = ch.nextInt();
    int c = ch.nextInt();
    temp = c;
    c = b;
    b = a;
    a = temp;
    System.out.println("A = " + a);
    System.out.println("B = " + b);
    System.out.println("C = " + c);
    ch.close();
  }
}
// in this prog the middile is not working successfuly you have to fix later
