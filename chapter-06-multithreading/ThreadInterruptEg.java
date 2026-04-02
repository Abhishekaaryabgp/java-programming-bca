/*
 * class A extends Thread {
 * public void run() {
 * System.out.println(Thread.currentThread().getName());
 * System.out.println("Start of thread A=>=>=>=>");
 * for (int i = 1; i <= 10; i++) {
 * System.out.println(" i=" + i);
 * // System.out.println("this.isDaemon()="+this.isDaemon());
 * }
 * System.out.println("End of thread A****");
 * }
 * }
 * 
 * class B extends Thread {
 * public void run() {
 * System.out.println(Thread.currentThread().getName());
 * System.out.println("Start of thread B=>=>=>=>");
 * try {
 * for (int j = 1; j <= 10; j++) {
 * System.out.println(this.isAlive());
 * System.out.println(" \tj=" + j);
 * sleep(1000);
 * // System.out.println("this.isDaemon()="+this.isDaemon());
 * }
 * } catch (InterruptedException e) {
 * System.out.println(e);
 * }
 * System.out.println("End of thread B****");
 * }
 * }
 * 
 * class C extends Thread {
 * public void run() {
 * System.out.println("Start of thread C=>=>=>=>");
 * for (int k = 1; k <= 10; k++) {
 * System.out.println(" \t\tk=" + k);
 * 
 * // System.out.println("this.isDaemon()="+this.isDaemon());
 * }
 * System.out.println("End of thread C****");
 * }
 * }
 * 
 * public class ThreadInterruptEg {
 * public static void main(String args[]) {
 * A p = new A();
 * B q = new B();
 * C r = new C();
 * System.out.println("p.getPriority()=" + p.getPriority());
 * System.out.println("q.getPriority()=" + q.getPriority());
 * System.out.println("r.getPriority()=" + r.getPriority());
 * p.setPriority(Thread.MAX_PRIORITY);
 * q.setPriority(Thread.MIN_PRIORITY);
 * System.out.println("p.isDaemon()=" + p.isDaemon());
 * p.setDaemon(true);
 * System.out.println("p.isDaemon()=" + p.isDaemon());
 * Thread.currentThread().setName("Main-Anand");
 * p.start();
 * System.out.println(Thread.currentThread().getName());
 * q.start();
 * System.out.println(p.isAlive());
 * q.interrupt();
 * r.start();
 * }
 * }
 */