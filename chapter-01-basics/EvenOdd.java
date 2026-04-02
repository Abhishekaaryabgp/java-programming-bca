import java.util.Scanner;

public class EvenOdd {

  public static void main(String[] args) {
    System.out.println(
      "Dear Pyare Enter The number to check No is even or odd!"
    );
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num == 2) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }
    sc.close();
  }
}
