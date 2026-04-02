public class pattern_05 {

  public static void main(String[] args) {
    int i, j, n = 10;
    for (i = 1; i <= n; i++) {
      for (j = i; j <= n; j++) {
        System.out.println();
      }
      for (j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
