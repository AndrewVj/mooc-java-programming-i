
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fName = scanner.nextLine();
        
        try(Scanner fReader = new Scanner(Paths.get(fName))) {
            while(fReader.hasNextLine()) {
                String line = fReader.nextLine();
                if(line.isEmpty()) {
                    continue;
                }
                String[] words = line.split(",");
                if(words[1].equals("1")) {
                    System.out.println(words[0]+", age: "+words[1]+" year");
                    continue;
                }
                System.out.println(words[0]+", age: "+words[1]+" years");
            }
        } catch (Exception e) {
            System.out.println("Error" +e);
        }

    }
}
