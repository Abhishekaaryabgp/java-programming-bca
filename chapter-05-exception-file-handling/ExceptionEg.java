import java.util.Scanner;

public class ExceptionEg {

  public static void main(String[] args) {
    try {
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int a[] = new int[n];
      System.out.println("Now Enter the Ele oif Array");
      for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
      }
      double d = a[3] / a[4];
      System.out.println("Result = " + d);
      sc.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Rest of code...");
  }
}
// Multiple Exceptions...
