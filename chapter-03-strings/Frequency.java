import java.util.Scanner;

public class Frequency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int index = 0;
    System.out.println("Dear User Enter Any String...");
    String input = sc.nextLine();
    System.out.println("Now Enter Any word to find frequency ...");
    String findstr = sc.nextLine();
    while ((index = input.indexOf(findstr, index)) != -1) {
      count++;
      index += findstr.length();
    }
    System.out.println(
      "The Total Frequency found ==> " +
      findstr +
      " <== in the string : " +
      count +
      " Times..."
    );

    sc.close();
  }
}
