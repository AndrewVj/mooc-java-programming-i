
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while(true) {
            
            System.out.println("Commands:\n" +
                                "1 - add a joke\n" +
                                "2 - draw a joke\n" +
                                "3 - list jokes\n" +
                                "X - stop");
            String command = this.scanner.nextLine();
            
            if(command.equals("X")) {
                break;
            }
            
            if(command.equals("1")) {
                this.add();
            }
            
            if(command.equals("2")) {
                this.draw();
            }
            
            if(command.equals("3")) {
                this.print();
            }
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }
    
    public void draw() {
        System.out.println(this.jokeManager.drawJoke());
    }
    
    public void print() {
        this.jokeManager.printJokes();
    }
}
