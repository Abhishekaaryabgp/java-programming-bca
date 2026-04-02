import java.lang.Math;
import java.util.Scanner;

class AreaCir {

  double r; // double is best option as compared to Float because in float will take (F) in the last..

  AreaCir() { // taking no argumne
    r = 0.0;
  }

  AreaCir(double a) { // taking parameters
    r = a;
  }

  void input() { // this function will take input ...
    Scanner sc = new Scanner(System.in);
    r = sc.nextDouble();
    sc.close();
  }

  void output() { // this function will take output ...
    System.out.println("Radious: " + r);
  }

  double CIRCUM() {
    return (2 * Math.PI * r);
  }

  double AREA() {
    return (Math.PI * r * r);
  }

  // Here the main class will be start ...

  public static void main(String[] args) {
    AreaCir obj = new AreaCir(); // here the name is ceating
    obj.output();
    System.out.println("Enter Radious :");
    obj.input();
    obj.output();
    System.out.println("Radious Area: " + obj.AREA());
    System.out.println("Radious Cir: " + obj.CIRCUM());
  }
}
