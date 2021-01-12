/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Container {
    
    private int containerVal;

    public Container() {
        this.containerVal = 0;
    }
    
    public int contains() {
        return this.containerVal;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        
        this.containerVal = this.containerVal +  amount;
        
        if(this.containerVal > 100) {
            this.containerVal = 100;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        
        this.containerVal = this.containerVal - amount;
        
        if(this.containerVal < 0) {
            this.containerVal = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.containerVal+"/100";
    }
}
