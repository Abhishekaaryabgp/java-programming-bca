import java.util.Scanner;

class SimpleInterest {

  public static void main(String args[]) {
    Float p, r, t, SI;
    System.out.print("Enter P/R/T one by one ..");
    Scanner ch = new Scanner(System.in);
    p = ch.nextFloat();
    r = ch.nextFloat();
    t = ch.nextFloat();
    SI = p * r * t;
    System.out.println("the SimpleInterest is " + SI);
    ch.close();
  }
}
