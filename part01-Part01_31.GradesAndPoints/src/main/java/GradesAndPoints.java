
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int gradePt = Integer.valueOf(scan.nextLine());
        if (gradePt < 0) {
            System.out.println("Grade: impossible!");
        } else if (gradePt < 50) {
            System.out.println("Grade: failed");
        } else if (gradePt < 60) {
            System.out.println("Grade: 1");
        } else if (gradePt < 70) {
            System.out.println("Grade: 2");
        } else if (gradePt < 80) {
            System.out.println("Grade: 3");
        } else if (gradePt < 90) {
            System.out.println("Grade: 4");
        } else if (gradePt <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
