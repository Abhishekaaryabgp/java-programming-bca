class M_Method_Calc {

  public static int Add(int num1, int num2) {
    return num1 + num2;
  }

  public static int Sub(int num1, int num2) {
    return num1 - num2;
  }

  public static int Mul(int num1, int num2) {
    return num1 * num2;
  }

  public static int Div(int num1, int num2) {
    return num1 / num2;
  }

  public static int Mod(int num1, int num2) {
    return num1 % num2;
  }

  public static int CS() {
    return ((2 * 5) / (63 + 2)); // returning 0
  }

  public static void main(String[] args) {
    int sum = Add(2, 4); // addition method is calling
    int mul = Mul(77, 55); // multiplication method is calling
    System.out.println(sum); // here the parameter is calling through a sum variable
    System.out.println(mul);
    System.out.println(CS());
  }
}
