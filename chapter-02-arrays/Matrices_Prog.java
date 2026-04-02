import java.util.Scanner;

public class Matrices_Prog {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nHey Welcome to the Matric Programe !");
    int a[][][];
    int row, col, i, j, k;
    System.out.println("Enter Row & Column:");
    row = sc.nextInt();
    col = sc.nextInt();
    a = new int[3][row][col];
    // Now lets read the elements...
    for (k = 0; k < 2; k++) {
      System.out.println("Enter " + (row * col) + " Element of Matric number!");
      for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
          a[k][i][j] = sc.nextInt();
        }
        System.out.println();
      }
    }
    // Now let add the matrices...
    for (i = 0; i < row; i++) {
      for (j = 0; j < col; j++) {
        a[2][i][j] = a[0][i][j] + a[1][i][j];
      }
    }
    // Now lets prints the elements of the matrix..
    for (k = 0; k < 3; k++) {
      System.out.println("Matric No " + k + 1 + ":");
      for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
          System.out.printf("3%d ", a[k][i][j]);
        }
        System.out.println();
      }
    }
    System.out.println("***** ARIGATO GOSAIMAS *****");
    sc.close();
  }
}
