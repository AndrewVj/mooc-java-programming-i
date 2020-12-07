
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fName = scanner.nextLine();
        
        try(Scanner fReader = new Scanner(Paths.get(fName))) {
            while(fReader.hasNextLine()) {
                String line = fReader.nextLine();
                System.out.println(line);
            }
        } catch(Exception e) {
            System.out.println("Error" + e);
        }
    }
}
