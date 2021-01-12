
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recipeAsListOfStrings = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.isEmpty()) {
                    Recipe recipe = new Recipe(recipeAsListOfStrings);
                    recipes.add(recipe);
                    recipeAsListOfStrings = new ArrayList<>();
                    continue;
                }
                recipeAsListOfStrings.add(line);
            }
            Recipe recipe = new Recipe(recipeAsListOfStrings);
            recipes.add(recipe);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("list")) {
                System.out.println("\nRecipes:");
                for(Recipe r: recipes) {
                    System.out.println(r);
                }
                System.out.println("");
                continue;
            }
            
            if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("\nRecipes:");
                for(Recipe r: recipes) {
                    if(r.getRecipeName().contains(searchedWord)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
                continue;
            }
            
            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for(Recipe r: recipes) {
                    if(r.getRecipeDuration() <= maxCookingTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
                continue;
            }
            
            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for(Recipe r: recipes) {
                    ArrayList<String> ingredients = r.getIngredients();
                    for(String ing: ingredients) {
                        if(ing.equals(ingredient)) {
                            System.out.println(r);
                        }
                    }
                }
                System.out.println("");
                continue;
            }
        }

        
    }

}
