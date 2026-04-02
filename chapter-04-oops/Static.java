import java.lang.String;

public class Static {

  static String str; // creating static string str

  public static void main(String[] args) {
    // Static p = new Static();
    // Static q = new Static();
    str = "Abhishek";
    System.out.println("String is : " + Static.str);
    // System.out.println("P.X = " + p.str);
    // System.out.println("Q.X = " + q.str);
  }
}
