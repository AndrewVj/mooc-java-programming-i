
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Stack {
    
    private ArrayList<String> stringStack;

    public Stack() {
        stringStack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stringStack.isEmpty();
    }
    
    public void add(String value) {
        this.stringStack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stringStack;
    }
    
    public String take() {
        String getString = this.stringStack.get(this.stringStack.size() - 1);
        this.stringStack.remove(this.stringStack.size() - 1);
        return getString;
    }
}
