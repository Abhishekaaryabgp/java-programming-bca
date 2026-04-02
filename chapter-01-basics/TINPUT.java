import java.util.Scanner;

public class TINPUT {

  public static void main(String[] args) {
    System.out.println(
      "Its also works which is sout shortform of system.out.println"
    );
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st No !");
    //int a = sc.nextInt(); // For Integer..
    // Float a = sc.nextFloat();
    // System.out.println("Enter 2nd No !");
    //int b = sc.nextInt(); // For Integer..
    // Float b = sc.nextFloat();
    // Float c = a + b;
    // Float d = a - b;
    // Float e = a / b;
    // Float f = a * b;
    // check int is or not using boollean ..
    // boolean a1 = sc.hasNextInt(); // for int...

    String str = sc.next(); // this will ignore white spaces ...
    String str1 = sc.nextLine(); // This will Take whole line including white spaces..
    System.out.print(str);
    System.out.println(str1);

    // System.out.println(a1);
    // System.out.println("Sum = " + c);
    // System.out.println("Sub = " + d);
    // System.out.println("Div = " + e);
    // System.out.println("Mul = " + f);
    sc.close();
  }
}
