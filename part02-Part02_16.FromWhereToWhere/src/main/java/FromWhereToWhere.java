
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int whrTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int whrFrom = Integer.valueOf(scanner.nextLine());
        while(whrFrom <= whrTo) {
            System.out.println(whrFrom);
            whrFrom++;
        }
    }
}
