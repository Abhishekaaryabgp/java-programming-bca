
//import java.io.File; // this is used for file handlings.
import java.io.FileReader;
//import java.io.FileWriter;
import java.util.Scanner;

public class CreatingFile {
    public static void main(String[] args) {

        // it is useful if you want to write something always write in try block
        /*
         * try {
         * File myfile = new File("file.txt");
         * myfile.createNewFile(); // file created
         * } catch (Exception e) {
         * System.out.println("Something went wrong!");
         * e.printStackTrace();
         * }
         */

        // writing file
        /*
         * try {
         * FileWriter myfile = new FileWriter("file.txt");
         * myfile.write("Hey ohayo gozaimas \n take care");
         * myfile.close(); // always remember dont forget to close that file
         * 
         * } catch (Exception e) {
         * System.out.println("Something went wrong!");
         * e.printStackTrace();
         * }
         */
        // Reading the file
        try {
            FileReader myfile = new FileReader("file.txt");
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
