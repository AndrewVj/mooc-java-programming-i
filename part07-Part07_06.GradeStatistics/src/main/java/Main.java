
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        PointRegister register = new PointRegister();
        System.out.println("Enter point totals, -1 stops: ");
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if(point == -1) {
                break;
            }
            register.addPoint(point);
        }
        System.out.println("Point average (all): " +register.averageOfPoints());
        System.out.println("Point average (passing): "+register.averageOfPassingPoints());
        System.out.println("Pass percentage: "+register.passPercentage());
        System.out.println("Grade distribution:");
        register.printGradeDistribution();
    }
}
