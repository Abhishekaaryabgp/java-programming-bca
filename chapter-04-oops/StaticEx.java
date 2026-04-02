class StaticEx {

  static void inp() { // only static method can only call by static method
    int a = 12;
    System.out.println("The Value of a is " + a);
  }

  void disp() { // not static cannot call by static method
    System.out.println("Hello");
  }

  public static void main(String[] args) {
    inp();
    // disp(); // non static method only by objeect method can call
  }
}
