import java.util.Scanner;

public class Fibonacch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nHey User Enter a number to get Fibonacchi Number!");
    int num = sc.nextInt();
    int a = 0;
    int b = 1;
    int c;
    System.out.println("A = " + a + " B = " + b);
    for (int i = 2; i < num; i++) {
      c = a + b;
      System.out.println("Fibonacchi Number of " + num + " is :" + c);
      a = b;
      b = c;
    }
    sc.close();
  }
}
