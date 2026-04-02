public class pattern_03 {

  public static void main(String[] args) {
    System.out.println("Lets Print patterns !");
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(i + " * ");
      }
      System.out.println();
    }
  }
}
