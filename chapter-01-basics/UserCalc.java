import java.util.Scanner;

public class UserCalc {

  public static void main(String[] args) {
    System.out.println(
      "\nHey Dear Sweet user Welcome to your Calculater App !"
    );
    System.out.println("This Apps Can perform these 5 operatios which are :  ");
    System.out.println(
      "\n\n\n*** (1) Sum, (2) Sub, (3) Mul, (4) Div, (5) Mod ! ***  "
    );

    Scanner sc = new Scanner(System.in);

    int ch = sc.nextInt();
    //int sum, sub, mul, div, mod;

    switch (ch) {
      case 1:
        System.out.println("1 is for Addition Operation");
        System.out.println(" Enter two Number 1 by 1!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Your Sum is " + c);
        break;
      case 2:
        System.out.println("2 is for Subtraction Operation");
        System.out.println(" Enter two Number 1 by 1!");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = d - e;
        System.out.println("Your Subtraction is " + f);
        break;
      case 3:
        System.out.println("3 is for Multiplication Operation");
        System.out.println(" Enter two Number 1 by 1!");
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = g * h;
        System.out.println("Your Multiplication is " + i);
        break;
      case 4:
        System.out.println("4 is for Divison Operation");
        System.out.println(" Enter two Number 1 by 1!");
        Float j = sc.nextFloat();
        Float k = sc.nextFloat();
        Float l = j / k;
        System.out.println("Your Division is " + l);
        break;
      case 5:
        System.out.println("5 is for Modulas Operation");
        System.out.println(" Enter two Number 1 by 1!");
        Double m = sc.nextDouble();
        Double n = sc.nextDouble();
        Double o = m % n;
        System.out.println("Your Modulas is " + o);
        break; // The case 5 is not completed yet!
    }
    System.out.println("Thanks Visit Again !");
    sc.close();
  }
}
