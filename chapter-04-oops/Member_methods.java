class Member_methods {

  public static void Hello() { //here methods is ready to call
    System.out.println("Congratulations!");
  }

  public static void main(String[] args) {
    // because of Member methods is not a functin so the parameterised methods will not call
    // if you want to call parameterised methods so call in System.out.println()...
    Hello(); // here method is calling and we can call multiple times
    Hello(); // calling again and again
    Hello(); // Same methods is calling
  }
}
// below this is the sysntax of the methods in java
// public static int "Name"(parameters){
// statement returns..
// }
