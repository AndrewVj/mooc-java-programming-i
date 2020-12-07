
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        try(Scanner fReader = new Scanner(Paths.get("data.txt"))) {
            while(fReader.hasNextLine()) {
                String line = fReader.nextLine();
                System.out.println(line);
            }
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
    }
}
