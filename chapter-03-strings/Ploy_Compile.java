public class Ploy_Compile {

  // compile time polymorphism example // also called method overloading
  public int add(int a, int y) {
    return a + y;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Ploy_Compile obj = new Ploy_Compile();
    System.out.println(obj.add(2, 4));
    System.out.println(obj.add(3, 6, 6));
  }
}
