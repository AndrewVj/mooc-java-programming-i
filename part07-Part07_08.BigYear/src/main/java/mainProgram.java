
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birdsList = new ArrayList<>();
        
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birdsList.add(bird);
                continue;
            }
            
            if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                int found = -1;
                for(Bird b: birdsList) {
                    if(b.getName().equals(name)) {
                        b.Observation();
                        found = 1;
                        break;
                    }
                }
                if(found == -1) {
                    System.out.println("Not a bird!");
                }
                continue;
            }
            
            if(command.equals("All")) {
                for(Bird b: birdsList) {
                    System.out.println(b);
                }
                continue;
            }
            
            if(command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                for(Bird b: birdsList) {
                    if(b.getName().equals(name)) {
                        System.out.println(b);
                        break;
                    }
                }
                
            }
        }
    } 
}
