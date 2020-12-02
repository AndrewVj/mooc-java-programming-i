
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }
            sum = sum + num;
            cnt++;
        }

        System.out.println("Average of the numbers: "+(sum/(double)cnt));    
    }
}
