class Aarya {

  void dontOver() { // no arg
    System.out.println("Try");
  }

  void dontOver(String r) { // with argu
    System.out.println("Suiiiiii!");
  }
}

public class OverloadingEX {

  public static void main(String[] args) {
    Aarya obj = new Aarya();
    obj.dontOver("Suii");
  }
}
