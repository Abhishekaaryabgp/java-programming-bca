// class A is thread is created using run method
/*
 * class A extends Thread {
 * 
 * public void run() {
 * for (int i = 1; i < 10; i++) {
 * System.out.println("\nFrom Thread A: I = " + i);
 * }
 * System.out.println("Exit from Thread A ...");
 * }
 * }
 * 
 * // class B is created using run method
 * class B extends Thread {
 * 
 * public void run() {
 * for (int j = 1; j < 5; j++) {
 * System.out.println("From Thread B: J = " + j);
 * }
 * System.out.println("Exit from Thread B ...");
 * }
 * }
 * 
 * // class C is created using run method
 * class C extends Thread {
 * 
 * public void run() {
 * for (int k = 1; k < 5; k++) {
 * System.out.println("\nFrom Thread C: K = " + k);
 * }
 * System.out.println("Exit from Thread C ...");
 * }
 * }
 * 
 * public class ThreadEx {
 * 
 * public static void main(String[] args) {
 * new A().run(); // run will output simple
 * new B().start();
 * new C().start(); // to calling eun method we use .start in Multithreading
 * A p = new A();
 * p.start();
 * }
 * }
 */