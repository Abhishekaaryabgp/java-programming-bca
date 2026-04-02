import java.util.Scanner;

public class Calculate_Marks {

  public static void main(String[] args) {
    Scanner ch = new Scanner(System.in);
    int Total = 500;
    System.out.println("Hey USer Whatsup Is everything is okay or Not");
    System.out.println(
      "I hope everyting is okay so this app will calculate your total marks & Percentage"
    );
    System.out.println("Enter First Subject No ");
    int Firstsub = ch.nextInt();
    System.out.println("Enter First Subject No ");
    int Secondsub = ch.nextInt();
    System.out.println("Enter First Subject No ");
    int Thirdsub = ch.nextInt();
    System.out.println("Enter First Subject No ");
    int Forthsub = ch.nextInt();
    System.out.println("Enter First Subject No ");
    int Fifthsub = ch.nextInt();
    int Sum = Firstsub + Secondsub + Thirdsub + Forthsub + Fifthsub;
    int per = (Sum * 100) / Total;
    System.out.println("You got " + Sum);
    System.out.println("Total Percentage is " + per);
    ch.close();
  }
}
