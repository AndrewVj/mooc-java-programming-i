
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999) {
                break;
            }
            numbers.add(num);
        }
        
        int smallest = numbers.get(0);
        for(int n: numbers) {
            if(n < smallest) {
                smallest = n;
            }
        }
        System.out.println("Smallest number: "+smallest);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == smallest) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
