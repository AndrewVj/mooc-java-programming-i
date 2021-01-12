/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int noOfObeservations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.noOfObeservations = 0;
    }
    
    public void Observation() {
        this.noOfObeservations++;
    }

    public String getName() {
        return name;
    }
    
    public String toString() {
        return this.name+" ("+this.latinName+"): "+this.noOfObeservations+" observations";
    }
    
    
}
