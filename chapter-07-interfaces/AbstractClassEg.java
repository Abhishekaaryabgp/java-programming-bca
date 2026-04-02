public class AbstractClassEg {

  private double r; // creation of r is abstract it is private

  public void Circle(double r) {
    this.r = r;
  }

  public double Area() {
    return Math.PI * r * r;
  }

  public static void main(String[] args) {
    AbstractClassEg obj = new AbstractClassEg();
    obj.Circle(0); // pasing parameter
    obj.Area();
    System.out.println(obj.Area()); // printing Area
  }
}
