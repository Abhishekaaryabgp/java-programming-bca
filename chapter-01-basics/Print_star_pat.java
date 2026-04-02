public class Print_star_pat {

  public static void main(String[] args) {
    int i, j;
    //int c = 0;
    for (i = 1; i <= 10; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
        //c++;
      }
      System.out.println();
    }
  }
}
