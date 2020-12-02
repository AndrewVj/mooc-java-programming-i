
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String toSearch = scanner.nextLine();
        /*int found = -1;
        for(String s: list) {
            if(s.equals(toSearch)) {
                found = 1;
            }
        }
        if(found == 1) {
            System.out.println(toSearch+" was found!");
        } else {
            System.out.println(toSearch+" was not found!");
        }*/
        if(list.contains(toSearch)) {
            System.out.println(toSearch+" was found!");
        } else {
            System.out.println(toSearch+" was not found!");
        }
    }
}
