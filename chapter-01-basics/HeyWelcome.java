import java.util.Scanner;

public class HeyWelcome {
    public static void main(String[] args) {
        String st = "abhishek";
        System.out.println("Hey dear Welcome back this is just a simple if else program");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 7; i++) {
            System.out.println("Step " + i);

            if (st == "abhishek") {
                System.out.println("You are the main lead of this story.");
            } else {
                System.out.println("You are the side characer of this story.");
            }
        }
        sc.close();
    }
}
