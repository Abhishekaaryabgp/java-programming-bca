import java.util.Scanner;

public class Rectangle {

  double l, b;

  Rectangle() {
    l = b = 0.0;
  }

  Rectangle(double x, double y) {
    l = x;
    b = y;
  }

  void input() {
    Scanner sc = new Scanner(System.in);
    l = sc.nextDouble();
    b = sc.nextDouble();
    sc.close();
  }

  void disp() {
    System.out.println("Length = " + l + " Breadth = " + b);
  }

  double Area() {
    return (l * b);
  }

  double peri() {
    return (2 * (l + b));
  }

  public static void main(String[] args) {
    Rectangle obj = new Rectangle(); // this is how object is constructed...
    obj.disp();
    obj.input();
    obj.disp();
    System.out.println("Area is " + obj.Area());
    System.out.println("Perimeter is " + obj.peri());
  }
}
