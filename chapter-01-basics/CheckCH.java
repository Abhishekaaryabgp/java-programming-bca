import java.util.Scanner;

class Program {
    String name;
    String model;
    String Gen;
    int MFyear;
    int Ram;
    String GFXCard;

    public void takeIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear User Please Enter Your PC Name : ");
        name = sc.nextLine(); // for name

        System.out.println("Now Enter your PC Models : ");
        model = sc.nextLine(); // for model

        System.out.println("Enter Your PC Generation for EX : [i3],[i4],[i5],[i7] ..etc");
        Gen = sc.nextLine(); // for generation

        System.out.println(
                "Enter Manufacture year [Check your Pc Back or down where the manufacture year will be mentioned :]");
        MFyear = sc.nextInt();// for Manufacturer year

        System.out.println("Enter Your PC RAM :");
        Ram = sc.nextInt(); // for Ram

        System.out.println("Enter Your Graphic Card name :");
        GFXCard = sc.next(); // for Graphic Card
        sc.close();
    }

    public void ShowDetails() {
        System.out.println("||*******************************************************************||");
        System.out.println("\n\n\nYour Pc name is ");
        System.out.println(name);
        System.out.println("Your Pc Model is ");
        System.out.println(model);
        // System.out.println("Program.ShowDetails()"); // using this you can call a
        // function without creating objects ..
        System.out.println("Your Pc Generation is ");
        System.out.println(Gen);
        System.out.println("Your Pc manufacure date is ");
        System.out.println(MFyear);
        System.out.println("Your Hava " + Ram + "GB Ram PC");
        System.out.println("Your Have :" + GFXCard + " Graphics Card integrated in your Computer\n\n\n");
    }

}

class CheckCH {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.takeIn();
        obj.ShowDetails();
        System.out.println("Your PC is Good and Not for Gaming ...");
    }
}