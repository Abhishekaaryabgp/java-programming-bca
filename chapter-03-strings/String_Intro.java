import java.util.Scanner;

public class String_Intro {

  public static void main(String[] args) {
    String name = new String("Aarya"); // this is how string works..
    String name2 = "Dadrio"; // this is also a string
    System.out.println(name);
    System.out.println(name2);
    System.out.printf("HEllo Baby!\n"); // this also contains a string and you can say that value using printf
    int a = 2;
    float b = 32.22f;
    System.out.printf("THE VALUE OF a is %d & the value of b is %f", a, b); // this is also works as c format
    System.out.format("\nHello World!"); // this also works as c format
    Scanner sc = new Scanner(System.in);
    String st = sc.next(); // this will store a string as input...and this next will take only one word
    String st1 = sc.nextLine(); // this will store the whole string as a input
    System.out.println(st);
    System.out.println(st1);
    sc.close();
  }
}
