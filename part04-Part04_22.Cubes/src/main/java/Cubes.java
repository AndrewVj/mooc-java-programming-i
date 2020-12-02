
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String strNum = scanner.nextLine();
            if(strNum.equals("end")) {
                break;
            }
            int intVal = Integer.valueOf(strNum);
            System.out.println(intVal*intVal*intVal);
        }
    }
}
