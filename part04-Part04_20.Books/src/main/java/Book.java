/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Book {
    
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getEverything() {
        return this.title+", "+this.pages+" pages, "+this.pubYear;
    }
    
    public String getName() {
        return this.title;
    }
    
}
