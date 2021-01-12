
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight <= this.maxWeight) {
            items.add(item);
            this.totalWeight = this.totalWeight + item.getWeight();
        }
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        for(Item item: items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    
    public String toString() {
        
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1) {
            return this.items.size()+" item ("+this.totalWeight+" kg)";
        }
        return this.items.size()+" items ("+this.totalWeight+" kg)";
    }
}
