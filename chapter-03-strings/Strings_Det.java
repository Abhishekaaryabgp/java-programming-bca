import java.util.Scanner;

public class Strings_Det {

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter a string...");
  //   String str = sc.nextLine(); // Always use nextline() to get st ring value...as input.
  //   System.out.println("You entered ...:" + str);
  //   sc.close();
  // }

  // Avobe input strings are the first method.
  // Below input string converting into integer values..
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("String Enter kar bsdk!");
    // taking as integer input
    String[] string = new String[sc.nextInt()];
    sc.nextLine();
    for (int i = 0; i < string.length; i++) {
      string[i] = sc.nextLine();
    }
    System.out.println("You have entered :");
    for (String str : string) {
      System.out.println(str);
    }
    sc.close();
  }
}
