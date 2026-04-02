import java.util.Scanner;

public class ArrEX {

  public static void main(String[] args) {
    int S[] = { 2, 4, 5, 6 };
    System.out.println("Welcome Back Abhishek Lets Start preparation!");
    System.out.println("Enter your name to get serially printed.. ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < S.length; i++) {
      System.out.println(S[i] + " ");
    }
    sc.close();
  }
}
