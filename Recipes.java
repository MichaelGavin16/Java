package SteppingStones;
 
import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author Gavins
 */
 
//Instance Variables 
public class Recipe { 
    private String recipeName; //string to input the recipe name
    private int servings; //interger for the number of servings
    ArrayList<String> recipeIngredients = new ArrayList(); //declaring an array
    private int totalRecipeCalories; //integer for total calories
    

//Accessors and Mutators for the Instance Variables
    
    //Mutators for setting values
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
    
    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    
    //Accessors for getting values
    public String getRecipeName() {
        return recipeName;
    }
      
    public int getServings() {
        return servings;
    }
    
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    public int getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    
//Constructors    
    public Recipe() {
        recipeName = "";
        servings = 0; 
        recipeIngredients = new ArrayList<String>();
        totalRecipeCalories = 0;  
    }

    
//A printRecipe() Method
    public void printRecipe() {
        
        System.out.println("Recipe: " + recipeName);
        System.out.println("Servings: " + servings);
        System.out.println("Ingredients: " + recipeIngredients);
        System.out.println("Each Serving Has " + totalRecipeCalories + " Calories.");
    }
 
/**
 * @param A createNewRecipe() Method to Build a Recipe From User Input
 */    
    
 
    public Recipe createNewRecipe() {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();
 
        
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String ingredientName = scnr.next();

            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
               
            }
            

            else {
                recipeIngredients.add(ingredientName);
                addMoreIngredients = true;

                System.out.println("Please enter the ingredient amount: ");
                int ingredientAmount = scnr.nextInt();
            
                System.out.println("Please enter the ingredient Calories: ");
                int ingredientCalories = scnr.nextInt();
                
                totalRecipeCalories = (ingredientCalories * ingredientAmount);
            }
           
       } 
        
           while (addMoreIngredients == true);
        
        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, 
            servings, recipeIngredients, totalRecipeCalories);
        recipe1.printRecipe();
    return x;
    }
}


//Psuedocode

/* 
CREATE a new recipe
    DEFINE variables

DISPLAY recipeName
READ user input

DISPLAY servings
READ user input

DISPLAY ingredientName
READ user input
IF user input is 'end'
    THEN addMoreIngredients is false
ELSE user input is an ingreidentName
    THEN addMoreIngredients is true
WHILE addMoreIngredients is true
    PRINT recipe
*/
