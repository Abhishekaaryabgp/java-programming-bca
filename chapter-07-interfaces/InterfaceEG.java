/*
 * interface B {
 * static final int a = 5; // cannot change
 * 
 * public abstract void disp();
 * }
 * 
 * class A implements B {
 * 
 * int b = 5;
 * 
 * public void disp() {
 * System.out.println("A = " + a + " B = " + b);
 * }
 * }
 * 
 * class InterfaceEG {
 * 
 * public static void main(String[] args) {
 * A obj = new A();
 * obj.disp();
 * }
 * }
 * // From class C extend B implement A
 * // using interface creating class
 */