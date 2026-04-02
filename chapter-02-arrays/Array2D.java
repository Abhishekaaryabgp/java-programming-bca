public class Array2D {

  public static void main(String[] args) {
    // Scanner ch = new Scanner(System.in);
    System.out.println("hey welcome dear!...");
    int i, j;
    int a[][] = new int[5][];
    a[0] = new int[] { 4, 2, 6, 5, 8, 7 };
    a[1] = new int[] { 1, 2, 3, 4 };
    a[2] = new int[] { 2, 6, 3, 4, 5, 7 };
    a[3] = new int[] { 1, 1, 2, 2 };
    a[4] = new int[] { 1, 2, 3, 4, 5, 6 };
    for (i = 0; i < 5; i++) {
      for (j = 0; j < a[i].length; j++) {
        System.out.printf("%3d", a[i][j]);
      }
      System.out.println();
    }
    // ch.close();
  }
}
