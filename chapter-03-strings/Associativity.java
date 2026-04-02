public class Associativity {

  public static void main(String[] args) {
    System.out.println("Hey Good Evening ...");
    int x = 8 * 3 / 2 + 4 - 2; // Associativity precidence
    /** lets use the precidence..
     * 8*3/2+4-2 asso left to right
     * 24/2+4-2
     * 12+4-2
     * 16-2
     * 14 // here the answer..
     */
    System.out.println(x);
  }
}
