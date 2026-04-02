import java.util.Scanner;

public class Area_Cir {

  public static void main(String[] args) {
    System.out.println("This is simple prog to finding Area & Circumference! ");
    System.out.println("Enter Radious!");
    double r;
    Scanner ch = new Scanner(System.in);
    r = ch.nextDouble();
    double area = (Math.PI * r * r);
    double circumference = (2 * Math.PI * r);
    System.out.println("Area is = " + area);
    System.out.println("Circumference is = " + circumference);
    ch.close();
  }
}
// this is simple and baasic progream this is not a classes and object programme
