// Runtime polymorphism or you can say the method overriding ...
class Animal {

  public void sound() {
    System.out.println("This is the ANIMAL Class Sounds");
  }
}

class Dog extends Animal {

  public void sound() {
    System.out.println("The Dog Voice is Bow Bow By Dog...");
  }
}

class Cat extends Animal {

  public void sound() {
    System.out.println("The Cat Voice is Meo........w");
  }
}

class Human extends Animal {

  public void sound() {
    System.out.println("The Human voice is Jai Shree ram ..");
  }
}

public class Runtime_Poly {

  public static void main(String[] args) {
    Animal obj = new Human();
    Animal obj1 = new Cat();
    Animal obj2 = new Dog();
    obj.sound();
    obj1.sound();
    obj2.sound();
  }
}
