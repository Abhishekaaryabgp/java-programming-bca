public class Inc_Dec {

  public static void main(String[] args) {
    int i = 99;
    // int a = i++ first assign then after increment
    // int a = ++i first increment then after assign
    System.out.println(i++); // this will not change
    System.out.println(i++); // but here the number will increased bu one..
    //System.out.println(++i); // will incrementing 2 times ...
    System.out.println(i--); // this will decrement the i value
    //System.out.println(i--); // here also decrement ..
    System.out.println(--i); // here decrement 2 time more

    // Example
    int y = 7;
    int x = ++y * 8;
    System.out.println(x);
    char ch = 'b';
    System.out.println(++ch);
  }
}
