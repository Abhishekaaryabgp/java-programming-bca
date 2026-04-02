import java.util.Scanner;

class Sub {
    public static void main(String[] args) {
        System.out.println("Hi Dear Subtractor Enter Two Number one bye one...");
        Scanner sc = new Scanner(System.in);
        System.out.println("A   ");
        int a = sc.nextInt();
        System.out.println("B   ");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("C = " +c);
        sc.close();
    }
}