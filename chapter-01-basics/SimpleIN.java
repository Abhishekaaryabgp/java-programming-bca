import java.util.Scanner;

public class SimpleIN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter p ");
    int p = sc.nextInt();
    System.out.println("Enter r ");
    int r = sc.nextInt();
    System.out.println("Enter t ");
    int t = sc.nextInt();
    int SI = p * r * t / 100;
    System.out.println("Simple Interest is :" + SI);
    sc.close();
  }
}
