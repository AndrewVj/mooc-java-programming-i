
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Shall we carry on?");
            String val = scanner.nextLine();
            if(val.equals("no")) {
                break;
            }
        }
    }
}
