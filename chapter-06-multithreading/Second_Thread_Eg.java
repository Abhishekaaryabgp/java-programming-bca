import java.util.Scanner;

class FirstThreadeg extends Thread {

  int a, b, c;

  public void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number !");
    a = sc.nextInt();
    System.out.println("Enter Second number !");
    b = sc.nextInt();
    c = a + b;
    System.out.println("the Sum of " + a + " and " + b + " = " + c);

    System.out.println("Arigato Gozaimas...end of  First Thread !\n");
    sc.close();
  }
}

class SecondThreadeg extends Thread {

  int a, b, c;

  public void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number !");
    a = sc.nextInt();
    System.out.println("Enter Second number !");
    b = sc.nextInt();
    c = a * b;
    System.out.println("the Multiplication of " + a + " and " + b + " = " + c);

    System.out.println("Arigato Gozaimas...end of  Secomd Thread !\n");
    sc.close();
  }
}

class thirdThreadeg extends Thread {

  public void run() {
    for (int i = 1; i < 6; i++) {
      System.out.println("Proccessing Error *****");
    }
    System.out.println("The End Process in Third Thread ....");
  }
}

class Second_Thread_Eg {

  public static void main(String[] args) {
    System.out.println("\nThread Example are printing ...");
    // first Thread
    new FirstThreadeg().run();
    // second Thread
    new SecondThreadeg().start();
  }
}
