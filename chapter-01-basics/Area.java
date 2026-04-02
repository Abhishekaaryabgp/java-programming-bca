import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lenght !");
    int l = sc.nextInt();
    System.out.println("Enter Bredth !");
    int b = sc.nextInt();
    int a = l * b;
    System.out.println("Area is " + a);
    sc.close();
  }
}
