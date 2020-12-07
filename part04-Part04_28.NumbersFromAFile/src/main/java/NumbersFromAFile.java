
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); 
        int count = 0;
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try(Scanner fReader = new Scanner(Paths.get(file))) {
            while(fReader.hasNextLine()) {
                String line = fReader.nextLine();
                if(line.isEmpty()) {
                    continue;
                }
                numbers.add(Integer.valueOf(line));
            }
        } catch(Exception e) {
            System.out.println("Error"+e);
        }
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        for(int n: numbers) {
            if(n >= lowerBound && n <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: "+count);
    }

}
