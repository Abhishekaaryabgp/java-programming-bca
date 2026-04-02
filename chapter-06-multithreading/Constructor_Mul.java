import java.util.Scanner;

class cons extends Thread {

  int a, b;

  public void run() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int index = 0;
    System.out.println("Dear Users Enter String...");
    String inp = sc.nextLine();
    System.out.println("Now Enter the word you want to find ?");
    String word = sc.nextLine();
    while ((index = inp.indexOf(word, index)) != -1) {
      count++;
      index += word.length();
    }
    System.out.println(
      "Your Words Frequecy Found ==> " +
      word +
      " <== is " +
      count +
      " Times ..."
    );

    sc.close();
  }
}

public class Constructor_Mul {

  public static void main(String[] args) {
    //cons obj = new cons();
    System.out.println("Here the 1st thread is running ..");
    // new cons().run();
    cons p = new cons();
    p.start();
  }
}
