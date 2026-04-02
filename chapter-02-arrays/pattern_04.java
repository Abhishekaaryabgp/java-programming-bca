public class pattern_04 {

  // This is decresing triangle
  public static void main(String[] args) {
    System.out.print("4th Pattern ::\n");
    int i, j, n = 5;
    for (i = 1; i <= n; i++) { // 1 to n...outer loop
      for (j = i; j <= n; j++) { // i to n ... inner loop
        System.out.print(i + "");
      }
      System.out.println();
    }
  }
}
