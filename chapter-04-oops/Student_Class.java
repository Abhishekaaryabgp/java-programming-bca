import java.util.Scanner;

public class Student_Class {

  int Roll;
  String name;
  String college;
  long Mobile_No;
  String emailNo;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name!");
    name = sc.nextLine();
    System.out.println("Enter your College Name!");
    college = sc.nextLine();
    System.out.println("Enter Roll Number!");
    Roll = sc.nextInt();
    System.out.println("Enter your Mobile Number!");
    Mobile_No = sc.nextLong();
    System.out.println("Enter your Email Address!");
    emailNo = sc.next();
    sc.close();
  }

  void disp() {
    System.out.println("Your name is : " + name);
    System.out.println("your College Name is : " + college);
    System.out.println("Your Roll Number is : " + Roll);
    System.out.println("Your Mobile Number is : \n" + Mobile_No);
    System.out.println("Your Email is this -> " + emailNo);
  }

  // Here the main class
  public static void main(String[] args) {
    Student_Class obj = new Student_Class(); // objext is created ...
    // Student_Class obj1 = new Student_Class();
    // Student_Class obj2 = new Student_Class();
    System.out.println("\n");
    System.out.println("***** STUDENTS DETAILS ******");
    obj.input();
    // obj1.input(); // This obj1 Line Also Not Working SIR!
    // obj2.input(); // this obj2 Line Also Not Working SIR!
    System.out.println(
      "Name:   ||   College Name:  ||    Roll No:    ||    Mobile No    ||         Email No            ||"
    );
    obj.disp();
    // obj1.disp(); // This Line Not Working SIR!
    // obj2.disp(); // This Line Also Not Working SIR!
  }
}
