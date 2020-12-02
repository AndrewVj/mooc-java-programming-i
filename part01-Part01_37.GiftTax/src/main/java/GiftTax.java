
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gftVal = Integer.valueOf(scan.nextLine());
        
        if(gftVal < 5000) {
            System.out.println("No tax!");
        } else if(gftVal >= 5000 && gftVal < 25000) {
            System.out.println("Tax:" + (100+(gftVal-5000)*0.08));
        } else if(gftVal >= 25000 && gftVal < 55000) {
            System.out.println("Tax:" + (1700+(gftVal-25000)*0.1));
        } else if(gftVal >= 55000 && gftVal < 200000) {
            System.out.println("Tax:" + (4700+(gftVal-55000)*0.12));
        } else if(gftVal >= 200000 && gftVal < 1000000) {
            System.out.println("Tax:" + (22100+(gftVal-200000)*0.15));
        } else {
            System.out.println("Tax:" + (142100+(gftVal-1000000)*0.17));
        }
    }
}
