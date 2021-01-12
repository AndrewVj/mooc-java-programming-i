
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.suitcases =  new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + this.totalWeight <= this.maxWeight) {
            suitcases.add(suitcase);
            this.totalWeight = this.totalWeight + suitcase.totalWeight();            
        }
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size()+" suitcases ("+this.totalWeight+" kg)";
    }
    
}
