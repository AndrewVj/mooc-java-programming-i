
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
    
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                this.add();
            }
            
            if(command.equals("list")) {
                this.list.print();
            }
            
            if(command.equals("remove")) {
                this.remove();
            }
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.list.add(task);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(scanner.nextLine());
        this.list.remove(toRemove);
    }
}
