
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
public class Recipe {
    private ArrayList<String> recipe;
    private String recipeName;
    private int recipeDuration;
    private ArrayList<String> ingredients;
    
    public Recipe(ArrayList<String> recipeAsListOfStrings) {
        this.recipe = recipeAsListOfStrings;
        this.recipeName = recipeAsListOfStrings.get(0);
        this.recipeDuration = Integer.valueOf(recipeAsListOfStrings.get(1));
        this.ingredients = this.getIngredients();
    }
    
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        for(int i = 2; i < this.recipe.size(); i++) {
            ingredients.add(this.recipe.get(i));
        }
        return ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getRecipeDuration() {
        return recipeDuration;
    }
    
    
    
    @Override
    public String toString() {
        return this.recipeName+", cooking time: "+this.recipeDuration;
    }
}
