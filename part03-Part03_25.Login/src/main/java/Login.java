
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: "); 
        String pwd = scanner.nextLine();
        if(userName.equals("alex") && pwd.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
            return;
        }
        if(userName.equals("emma") && pwd.equals("haskell")) {
            System.out.println("You have successfully logged in!");
            return;
        }
        System.out.println("Incorrect username or password!");
    }
}
