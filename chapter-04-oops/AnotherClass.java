class AClass { // parent class

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class pvr extends AClass {

  void disp() {
    System.out.println("Sum is:");
  }
} // using extend class we are calling the parent class

class AnotherClass {

  public static void main(String[] args) {
    pvr obj = new pvr(); // object creating in child class
    obj.add(55, 88); // calling add method from parent class
  }
}
