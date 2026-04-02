/*
 * interface A { // interface class
 * static final int a = 2; // static constant cannnot change
 * 
 * public abstract void show();
 * }
 * 
 * class B { // base class
 * 
 * int b;
 * 
 * // making constructor
 * B() {
 * b = 5;
 * }
 * 
 * public void show() {
 * System.out.println("B = " + b);
 * }
 * }
 * 
 * class C extends B implements A { // child class with interface
 * 
 * int c;
 * 
 * C() {
 * c = 21;
 * }
 * 
 * public void show() {
 * super.show();
 * System.out.println("A : = " + a + " C : = " + c);
 * }
 * }
 * 
 * class interface_Multi_In { // main class
 * 
 * public static void main(String[] args) {
 * C obj = new C();
 * obj.show();
 * }
 * }
 */