/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand hundredSeconds;
    
    public Timer() {
        this.seconds =  new ClockHand(60);
        this.hundredSeconds =  new ClockHand(100);
    }
    
    public void advance() {
        this.hundredSeconds.advance();
        
        if(this.hundredSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds+":"+hundredSeconds;
    }
    
}
