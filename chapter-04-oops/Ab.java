// Ingeritance .........................
class Mb {

  int a, b;

  Mb() { // non  arguments
    a = 10;
    b = 20;
  }

  Mb(int x, int y) { // with  parameters
    a = x;
    b = y;
  }

  void disp() { // display function
    System.out.println("a = " + a + " b = " + b);
  }

  int add() { // returning no arguments
    return (a + b);
  }

  int add(int x, int y) {
    return (a + b);
  }
} // parent class // method overloading

// inherited class
class Abc extends Mb { // Ab inheriting

  int c;

  Abc() { // non  arguments
    c = 5;
  }

  Abc(int x, int y, int z) {
    super(x, y); // we use super key to call parent class in java.
    c = z;
  } // with parameters

  void disp() {
    super.disp();
    System.out.println("C = " + c);
  }

  int add() { // method overloading ...
    return (super.add() + c);
  }

  int add(int x, int y, int z) {
    return (super.add(x, y) + z);
  }
}

class Ab {

  // main class starting
  public static void main(String[] args) {
    Mb p = new Mb();
    Mb q = new Mb(5, 10);
    Abc r = new Abc();
    Abc s = new Abc(5, 10, 15);

    System.out.println("Object P!");
    p.disp();
    System.out.println("Sum = " + p.add());
    System.out.println("P(Parameter) = " + p.add(5, 15));

    System.out.println("Object q!");
    q.disp();
    System.out.println("Sum = " + q.add());
    System.out.println("Q(Parameter) = " + q.add(5, 15));

    System.out.println("Object r!");
    r.disp();
    System.out.println("Sum = " + r.add());
    System.out.println("R(Parameter) = " + r.add(5, 15));

    System.out.println("Object s!");
    s.disp();
    System.out.println("Sum = " + s.add());
    System.out.println("S(Parameter) = " + s.add(5, 15));
  }
}
// inherited successfully working
// employe and circle
