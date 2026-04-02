import java.util.Scanner;

public class Check_Vowel {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nHello Dear Good Morning !");
    System.out.println(
      "in this Programme we will check enter character is vowel or not ?"
    );
    System.out.println(
      "If the input character is vowel it will show your input char is vowel if it is consonant it will exit! "
    );

    System.out.println(
      "In vowel we use an :: In consonant we use only a for demonstrqate the sentence... "
    );

    char ch = input.next().charAt(0); // for character input.. this is new in java

    if (ch == 'a') {
      System.out.println("a is vowel");
    }

    if (ch == 'e') {
      System.out.println("e is vowel");
    }

    if (ch == 'i') {
      System.out.println("i is vowel");
    }

    if (ch == 'o') {
      System.out.println("o is vowel");
    } else {
      //System.out.println("Consonants ");
    }
    input.close();
  }
}
// in this prog there is a bug we will fix it ..in the morning ...
