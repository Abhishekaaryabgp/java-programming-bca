import java.util.Scanner;

public class StringInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name ");
    String str = sc.nextLine();
    System.out.println("This is You Enter is is right! " + str);
    sc.close();
  }
}
