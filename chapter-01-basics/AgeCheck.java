import java.util.Scanner;

public class AgeCheck {

  public static void main(String[] args) {
    System.out.println("Hello user Welcome back Again !");
    System.out.println(
      "Enter Your are age to chek ! You are able to do or not ?"
    );
    Scanner ch = new Scanner(System.in);
    int age = ch.nextInt();
    if (age >= 18) {
      System.out.println(
        "You can do it ofcourse vote !"
      );
    } else {
      System.out.println(
        "u can do it !"
      );
    }
    ch.close();
  }
}
