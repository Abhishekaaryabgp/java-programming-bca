public class String_Methods {

  public static void main(String[] args) {
    String name = "Abhishek aarya!";

    int value = name.length();
    System.out.println(value); // this will print your string length
    System.out.println(name.startsWith("Abh")); // this will return true or false in boolean...
    System.out.println(name.endsWith("taa")); // this all are string method
    System.out.println(name.charAt(3)); // this will that index characters...availible on that index
    System.out.println(name.equals("Abhishek aarya!")); // this is matched value of given as name...
    System.out.println(name.getBytes()); // this will print garbage value
    System.out.println(name.equalsIgnoreCase("ABHISHEK AARYA!")); // this will ignore case and returen boolean value true and false
    System.out.println("Printing\\Double Quate"); // using \\ you can print bac k slas...
    System.out.println("Printing \"DubleQuate\""); // using \" You can also print double quate...
  }
}
