import java.util.Scanner;

public class Ilove_you {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The name to purpose 1000 times...");
    String str = sc.nextLine();

    for (int i = 0; i < 1000; i++) {
      System.out.println(str);
    }
    sc.close();
  }
}
