
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfAges = 0;
        int cnt = 0;
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("")) {
                break;
            }
            String[] words = line.split(",");
            if(longestName.length() < words[0].length()) {
                longestName = words[0];
            }
            sumOfAges = sumOfAges + Integer.valueOf(words[1]);
            cnt++;
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(sumOfAges/(double)cnt));
    }
}
